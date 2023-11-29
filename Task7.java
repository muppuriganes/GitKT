public class Task7 {
    public static void main(String[] args) {
        String word = "LALALALALA";
        countCharacters(word);
    }

    public static void countCharacters(String input) {
        input = input.toLowerCase(); // Convert the string to lowercase for case-insensitive counting

        int[] count = new int[26]; // Assuming only alphabetic characters (a-z)

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                count[index]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                char ch = (char) (i + 'a');
                System.out.println(ch + "=" + count[i]);
            }
        }
    }

    
}
