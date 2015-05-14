import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class AcceptedScore {

    @Test
    public void should_return_zero_when_any_knock_is_thrown() throws Exception {
        assertThat(new Score("--------------------").total(), is(0));
    }
}
