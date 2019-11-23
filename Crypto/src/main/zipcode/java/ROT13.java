public class ROT13 {
    Integer shift;


    ROT13(Character cs, Character cf) {
        shift = cf - cs;
    }

    ROT13() {
        shift = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {
        return encrypt(text);
    }

    public String encrypt(String text) {
        String ans ="";

        for (int i = 0; i < text.length(); i++){
            Character c = text.charAt(i);
            ans += shiftCheck(c);
        }

        return ans;
    }

    public String decrypt(String text) {
        shift = 26 - shift;
        return  encrypt(text);
    }

    public static String rotate(String s, Character c) {
        Integer startIndex = s.indexOf(c);
        String start = s.substring(startIndex);
        String end = s.substring(0, startIndex);
        return start + end;
    }

    public Character shiftCheck(Character before){
        Character temp;
        Character now;

        if(before >= 'a' && before <= 'z'){
            temp = (char) (before + shift);
            now = (temp > 'z') ? (char) (temp - 'z' +'a' -1) : temp;
            return now;
        }

        else if(before >= 'A' && before <= 'Z'){
            temp = (char) (before + shift);
            now = (temp > 'Z') ? (char) (temp - 'Z' +'A' -1) : temp;
            return now;
        }

        else { return  before; }
    }

}
