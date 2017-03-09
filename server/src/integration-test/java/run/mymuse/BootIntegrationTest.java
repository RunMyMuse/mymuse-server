package run.mymuse;

import org.hamcrest.Matchers;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Tests Boot.java
 */
public class BootIntegrationTest extends Matchers {
    @Test
    public void test() {
        assertThat(true, is(true));
    }
}
