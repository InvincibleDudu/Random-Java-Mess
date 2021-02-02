package codewars.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LongestRepetitionTest {

    @Test
    public void exampleTests() {
        assertArrayEquals(new Object[]{"a", 4}, LongestRepetition.longestRepetition("aaaabb"));
        assertArrayEquals(new Object[]{"a", 4}, LongestRepetition.longestRepetition("bbbaaabaaaa"));
        assertArrayEquals(new Object[]{"u", 3}, LongestRepetition.longestRepetition("cbdeuuu900"));
        assertArrayEquals(new Object[]{"b", 5}, LongestRepetition.longestRepetition("abbbbb"));
        assertArrayEquals(new Object[]{"a", 2}, LongestRepetition.longestRepetition("aabb"));
        assertArrayEquals(new Object[]{"", 0}, LongestRepetition.longestRepetition(""));
    }

}