import java.util.Random;

enum Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;

    public static Color randomThing() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];

    }
}