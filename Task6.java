public class Task6 {
    public static void main(String[] args) {
        String originalString = "1258-2439-2156";
        String maskedString = maskString(originalString);
        System.out.println("Masked String: " + maskedString);
    }

    public static String maskString(String input) {
        StringBuilder masked = new StringBuilder();
        int maskedCharacters = 0;

        for (int i = 0; i < input.length(); i++) {
            if (maskedCharacters < 2 || (maskedCharacters >= 9 && maskedCharacters < 13)) {
                masked.append(input.charAt(i));
            } else {
                masked.append('x');
            }

            if (input.charAt(i) != '-') {
                maskedCharacters++;
            }
        }

        return masked.toString();
    }
}
