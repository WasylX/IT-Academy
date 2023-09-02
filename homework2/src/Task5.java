public class Task5 {
    public static void main(String[] args) {
        char h = 'H'; // 'h' равен 104,'H' равен 72
        char e = 'E'; // 'e' равен 101 ,'E' равен 69
        char l = 'L'; // 'l' равен 108,'L' равен 76
        char o = 'O'; // 'l' равен 108,'L' равен 76

        // Используем арифметические операции для преобразования символов согласно таблице символов Unicode

        int shift = 'h' - 'H';

        h = (char) (h + shift);
        e = (char) (e + shift);
        l = (char) (l + shift);
        o = (char) (o + shift);


        System.out.println("" + h + e + l + l + o);

    }

}

