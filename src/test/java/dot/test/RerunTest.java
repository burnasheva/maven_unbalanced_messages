package dot.test;

import net.andreinc.mockneat.MockNeat;
import org.junit.Test;

import static org.junit.Assert.*;

public class RerunTest {

    @Test
    public void RandomlyPassTest() {
        MockNeat random = MockNeat.threadLocal();
        assertEquals(true,
                random.bools().probability(30.00).val());
    }
}
