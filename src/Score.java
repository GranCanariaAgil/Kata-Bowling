public class Score {

    private String line;

    public Score(String line) {
        this.line = line;
    }

    public int total() {
        for (int i = 0; i < line.length(); i++) {
            char number = line.charAt(i);
            if (number != '-') {
                return Integer.parseInt(String.valueOf(number));
            }
        }
        return 0;
    }
}
