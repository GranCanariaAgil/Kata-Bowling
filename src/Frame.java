import java.util.ArrayList;
import java.util.List;

public class Frame {

    private final List<Integer> rolls;

    public Frame(char... rolls) {
        this.rolls = new ArrayList<>();
        for (char roll : rolls) this.rolls.add(parseToInt(roll));
    }

    private int parseToInt(char number) {
        if (isSpare(number)) return 10 - rolls.get(0);
        if (isStrike(number)) return 10;
        if (isZero(number)) return 0;
        return number - 48;
    }

    private boolean isZero(char number) {
        return number == '-';
    }

    private boolean isStrike(char number) {
        return number == 'X';
    }

    private boolean isSpare(char number) {
        return number == '/';
    }

    public int knocks() {
        return rolls.stream().reduce(Integer::sum).get();
    }

    public int getRoll(int position) {
        return rolls.get(position);
    }

}
