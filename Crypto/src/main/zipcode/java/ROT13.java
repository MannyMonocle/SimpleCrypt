public class ROT13 {
    String message, encryptedMessage = "";


    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return "";
    }

    public String encrypt(String text) {
        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public static String rotate(String s, Character c) {
        int key;
        char ch;
        String end = "";
        if (Character.isUpperCase(c)) {
            key = c - 'A';
        } else {
            key = c - 'a';
        }

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if ((int) ch >= (int) 'a' && (int) ch <= (int) 'z') {
                ch = (char) (ch + key);


                if ((int) ch > (int) 'z') {
                    ch = (char) (ch - 'z' + 'a' - 1);
                }
                end += (char) ch;

            } else if ((int) ch >= (int) 'A' && (int) ch <= (int) 'Z') {
                ch = (char) (ch - 'Z' + 'A' - 1);
                if ((int) ch > (int) 'Z') {
                    ch = (char) (ch - 'Z' + 'A' - 1);
                }
                end += (char) ch;
            }
        }

        return end;
    }

}
