import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String inputText = "some color 0xAABBCC and another color #123456 and one more color 0x00FF00";

        String[] colors = extractColors(inputText);

        System.out.println("Список цветов без префиксов: " + Arrays.toString(colors));
    }

    private static String[] extractColors(String text) {
        String[] colors = new String[5];
        int colorCount = 0;

        String regex = "(?:#|0x|0X)([0-9A-Fa-f]{6})";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String color = matcher.group(1);
            colors[colorCount] = color;
            colorCount++;
        }

        String[] validColors = new String[colorCount];
        System.arraycopy(colors, 0, validColors, 0, colorCount);

        return validColors;
    }
}

