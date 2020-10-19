package dot.test;

import net.andreinc.mockneat.MockNeat;
import org.junit.Test;

import static org.junit.Assert.*;

public class RerunTest {

    @Test
    public void RandomlyPassTest() {
        MockNeat random = MockNeat.threadLocal();
        assertTrue(random.bools().probability(20.00).val());
    }
}
