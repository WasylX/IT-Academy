public class Task5 {
    public static void main(String[] args) {
        char h = 'H'; // 'h' равен 104,'H' равен 72
        char e = 'E'; // 'e' равен 101 ,'E' равен 69
        char l = 'L'; // 'l' равен 108,'L' равен 76
        char o = 'O'; // 'l' равен 108,'L' равен 76

        // Используем арифметические операции для преобразования символов согласно таблице символов Unicode

        int shift1 = 'h' - 'H';
        int shift2 = 'e' - 'E';
        int shift3 = 'l' - 'L';
        int shift4 = 'o' - 'O';


        h = (char) (h + shift1);
        e = (char) (e + shift2);
        l = (char) (l + shift3);
        o = (char) (o + shift4);

        System.out.println("" + h + e + l + l + o);

    }

}

