public class Task1 {
    public static void main(String[] args) {
        String str = "ротатор"; // Замените это значение на строку, которую вы хотите проверить

        if (isPalindrome(str)) {
            System.out.println(str + " является палиндромом.");
        } else {
            System.out.println(str + " не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^а-яА-Яa-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

