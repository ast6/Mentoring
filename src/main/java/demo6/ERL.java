package demo6;

public class ERL {

    public static String coder(String source) {
        StringBuilder dest = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            int runLength = 1;
            while (i + 1 < source.length() && source.charAt(i) == source.charAt(i + 1)) {
                runLength++;
                i++;
                if (runLength == 9) {
                    break;
                }
            }
            if (runLength != 1) {
                dest.append(runLength);
            }
            dest.append(source.charAt(i));
        }
        return dest.toString();
    }

    public String decoder(String text) {
        String res = "";
        char[] charArray = text.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char s = charArray[i];
            if (!Character.isDigit(s)) {
                res += s;
            } else {
                int num = Integer.parseInt(String.valueOf(s));
                for (int j = 0; j < num - 1; j++) {
                    res += charArray[1 + i];
                }
            }
        }
        return res;
    }
}
