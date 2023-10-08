public class Task2 {
    public static void main(String[] args) {
        String input = "раз два три";

        String[] words = input.split(" ");

        System.out.print("Слова в обратном порядке: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
    }
}

