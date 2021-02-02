package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RemoveDuplicateTest {

    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"codewars", "picaniny", "hubububo"}, RemoveDuplicate.dup(new String[]{"ccccccccoodddddddddewwwaaaaaaaaarrrrsssss", "piccaninny", "hubbubbubboo"}));
        assertArrayEquals(new String[]{"abracadabra", "alote", "asese"}, RemoveDuplicate.dup(new String[]{"abracadabra", "allottee", "assessee"}));
        assertArrayEquals(new String[]{"keles", "kenes"}, RemoveDuplicate.dup(new String[]{"kelless", "keenness"}));
    }

}