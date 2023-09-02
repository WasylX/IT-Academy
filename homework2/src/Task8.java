public class Task8 {
    public static void main(String[] args) {

    int x1 = 4;
    int y1 = 3;
    int x2 = 8;
    int y2 = 7;

    int m = (y2 - y1) / (x2 - x1);
    int b = y1 - m * x1;

        String bSymbol = (b < 0) ? " - " : " + ";
        System.out.println("f(x) = " + m + "x" + bSymbol + Math.abs(b));
    }
}

