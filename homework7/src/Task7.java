public class Task7 {
    public static void main(String[] args) {
        String inputText = "Это текст с адресами электронной почты: i.ivanov@it-academy.by и petrod-1986@yahoo.com.au";

        String[] emailAddresses = extractEmailAddresses(inputText);

        System.out.println("Адреса электронной почты в тексте: ");
        for (String email : emailAddresses) {
            System.out.println(email);
        }
    }

    public static String[] extractEmailAddresses(String text) {
        String[] words = text.split("\\s+");
        String[] foundEmails = new String[words.length];
        int emailCount = 0;

        for (String word : words) {
            if (word.contains("@") && word.contains(".")) {
                foundEmails[emailCount] = word;
                emailCount++;
            }
        }

        String[] result = new String[emailCount];
        System.arraycopy(foundEmails, 0, result, 0, emailCount);

        return result;
    }
}

