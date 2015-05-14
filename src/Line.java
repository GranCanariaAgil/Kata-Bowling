public class Line {

    private final Frame[] frames;

    public Line(String input) {
        frames = new Frame[10];
        int j = 0;
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new Frame(input.charAt(j), input.charAt(j + 1));
            j += 2;
        }
    }

    public Frame[] frames() {
        return frames;
    }

}
