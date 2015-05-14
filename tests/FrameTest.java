import org.junit.Test;

import static java.lang.invoke.MethodHandles.throwException;
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
        assertThat(new Frame('1', '3').getRoll(0), is(1));
        assertThat(new Frame('1', '3').getRoll(1), is(3));
    }

    @Test
    public void creates_a_frame_with_a_spare() throws Exception {
        assertThat(new Frame('1', '/').knocks(), is(10));
        assertThat(new Frame('1', '/').getRoll(0), is(1));
        assertThat(new Frame('1', '/').getRoll(1), is(9));
    }

    @Test
    public void creates_a_frame_with_a_strike() {
        assertThat(new Frame('X').knocks(), is(10));
        assertThat(new Frame('X').getRoll(0), is(10));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void a_strike_has_not_a_second_roll() {
        new Frame('X').getRoll(1);
    }
}
