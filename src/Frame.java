public class Frame {

    private final int firstRoll;
    private final int secondRoll;

    public Frame(char... rolls) {
        firstRoll = parseToInt(rolls[0]);
        secondRoll = parseToInt(rolls[1]);
    }

    private int parseToInt(char number) {
        if (number == '/') return 10 - firstRoll;
        if (number == '-') return 0;
        return number - 48;
    }

    public int knocks() {
        return firstRoll + secondRoll;
    }

    public int firstRoll() {
        return firstRoll;
    }

    public int secondRoll() {
        return secondRoll;
    }
}
