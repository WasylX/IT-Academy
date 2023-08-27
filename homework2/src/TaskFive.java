public class TaskFive {
    public static void main(String[] args) {
        char h = 'H'; // 'h' равен 104,'H' равен 72
        char e = 'E'; // 'e' равен 101 ,'E' равен 69
        char l = 'L'; // 'l' равен 108,'L' равен 76
        char o = 'O'; // 'l' равен 108,'L' равен 76

        // Используем арифметические операции для преобразования символов согласно таблице символов Unicode
        h = (char) (h + ('h' - 'H'));
        e = (char) (e + ('e' - 'E'));
        l = (char) (l + ('l' - 'L'));
        o = (char) (o + ('l' - 'L'));

        System.out.println("" + h + e + l + l + o);

    }

}

