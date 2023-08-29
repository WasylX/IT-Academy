public class Task8 {
    public static void main(String[] args) {

    int x1 = 4;
    int y1 = 3;
    int x2 = 8;
    int y2 = 7;

    int m = (y2 - y1) / (x2 - x1);
    int b = y1 - m * x1;
    //System.out.println("f(y) = " + m + "x " + "+ " + b); // - Мне не нравится что выводится f(x) = 1x + -1
        String bSymbol = (b < 0) ? " - " : " + "; // Нашел способ

        System.out.println("f(x) = " + m + "x" + bSymbol + Math.abs(b));

    }
}

