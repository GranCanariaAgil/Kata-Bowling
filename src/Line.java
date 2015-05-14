public class Line {

    private final Frame[] frames;

    public Line(String input) {
        frames = new Frame[10];
        for (int i = 0; i < frames.length; i++) {
            frames[i] = new Frame('-', '-');
        }
    }

    public Frame[] frames() {
        return frames;
    }

}
