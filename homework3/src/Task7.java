public class Task7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 7;
        int d = 2;
        int e = 7;

        int maxNum = a;
        int minNum = a;
        String maxVar = "a";
        String minVar = "a";

        if (b > maxNum) {
            maxNum = b;
            maxVar = "b";
        } else if (b < minNum) {
            minNum = b;
            minVar = "b";
        }

        if (c > maxNum) {
            maxNum = c;
            maxVar = "c";
        } else if (c < minNum) {
            minNum = c;
            minVar = "c";
        }

        if (d > maxNum) {
            maxNum = d;
            maxVar = "d";
        } else if (d < minNum) {
            minNum = d;
            minVar = "d";
        }

        if (e > maxNum) {
            maxNum = e;
            maxVar = "e";
        } else if (e < minNum) {
            minNum = e;
            minVar = "e";
        }

        if (a == b && b == c && c == d && d == e) {
            System.out.println("Все числа равны между собой: " + a);
        } else {
            System.out.println("Максимальное число: " + maxVar + " со значением " + maxNum);
            System.out.println("Минимальное число: " + minVar + " со значением " + minNum);
        }
    }
}

