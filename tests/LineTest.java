import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LineTest {

    @Test
    public void creates_a_line_with_only_simple_frames(){
        Line line = new Line("--------------------");
        for (Frame frame : line.frames())
            assertThat(frame.knocks(), is(0));
    }


}
