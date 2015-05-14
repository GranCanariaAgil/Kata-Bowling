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
}
