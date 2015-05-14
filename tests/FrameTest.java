import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FrameTest {
    @Test
    public void creates_a_frame_without_knocks(){
        assertThat(new Frame('-', '-').knocks(), is(0));
    }

    @Test
    public void creates_a_frame_with_two_non_zero_rolls() throws Exception {
        assertThat(new Frame('1', '3').knocks(), is(4));
        assertThat(new Frame('1', '3').firstRoll(), is(1));
        assertThat(new Frame('1', '3').secondRoll(), is(3));
    }
}
