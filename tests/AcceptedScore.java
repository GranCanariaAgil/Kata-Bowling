import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AcceptedScore {

    @Test
    public void should_return_zero_when_no_knocks_are_thrown() throws Exception {
        assertThat(new Score("--------------------").total(), is(0));
    }

    @Test
    public void should_return_five_when_only_five_knocks_are_thrown() throws Exception {
        assertThat(new Score("-5------------------").total(), is(5));
    }

    @Test
    public void should_return_eight_when_only_eight_knocks_are_thrown() throws Exception {
        assertThat(new Score("8-------------------").total(), is(8));
    }

    @Test
    public void should_return_seven_when_only_seven_knocks_are_thrown() throws Exception {
        assertThat(new Score("61------------------").total(), is(7));
    }

    @Test
    public void should_consider_next_throw_to_calculate_a_spare() throws Exception {
        assertThat(new Score("6/4-----------------").total(), is(18));
    }

    @Test
    public void should_calculate_a_simple_frame_score(){
        assertThat(new Score(new Line("")).total(), is(4));
    }

}
