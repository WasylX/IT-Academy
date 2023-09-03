public class Task5 {
    public static void main(String[] args) {
        double x = 2.0;
        double y = 0;

        if (x > 0 && y > 0) {
            System.out.println("Точка находится в первой четверти.");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка находится во второй четверти.");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка находится в третьей четверти.");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка находится в четвёртой четверти.");
        }else {
            System.out.println("WrongValue");
        }
    }
}

