package codewars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HumanReadableTime2Test {

    @Test
    public void exampleTests() {
        assertEquals("1 second", HumanReadableTime2.formatDuration(1));
        assertEquals("1 minute and 2 seconds", HumanReadableTime2.formatDuration(62));
        assertEquals("2 minutes", HumanReadableTime2.formatDuration(120));
        assertEquals("1 hour", HumanReadableTime2.formatDuration(3600));
        assertEquals("1 hour, 1 minute and 2 seconds", HumanReadableTime2.formatDuration(3662));
    }
}