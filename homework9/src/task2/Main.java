package task2;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 42);
        System.out.println("Original Pair: " + pair);
        System.out.println("First: " + pair.first());
        System.out.println("Last: " + pair.last());

        var swappedPair = pair.swap();
        System.out.println("Swapped Pair: " + swappedPair);

        pair.replaceFirst("World");
        System.out.println("replaceFirst: " + pair);
        pair.replaceLast(1);
        System.out.println("replaceLast: " + pair);
    }
}

