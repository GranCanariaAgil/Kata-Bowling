public class Score {

    private String line;

    public Score(String line) {
        this.line = line;
    }

    public int total() {
        int sum = 0;
        for (int i = 0; i < line.length(); i++) {
            char number = line.charAt(i);
            if (number != '-') {
                sum += Integer.parseInt(String.valueOf(number));
            }
        }
        return sum;
    }
}
