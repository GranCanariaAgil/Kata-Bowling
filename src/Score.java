public class Score {

    private String line;

    public Score(String line) {
        this.line = line;
    }

    public int total() {
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            char number = line.charAt(i);
            if (number == '/') sum += 10 - parseToInt(line.charAt(i - 1)) + parseToInt(line.charAt(i + 1));
            else if (number != '-') sum += parseToInt(number);
        }
        return sum;
    }

    private int parseToInt(char number) {
        return number - 48;
    }
}
