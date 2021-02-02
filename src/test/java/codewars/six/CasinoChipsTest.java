package codewars.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasinoChipsTest {

    @Test
    public void basicTests(){
        assertEquals(1, CasinoChips.solve(new int[] {1,1,1}));
        assertEquals(2, CasinoChips.solve(new int[] {1,2,1}));
        assertEquals(2, CasinoChips.solve(new int[] {4,1,1}));
        assertEquals(9, CasinoChips.solve(new int[] {8,2,8}));
        assertEquals(5, CasinoChips.solve(new int[] {8,1,4}));
        assertEquals(10, CasinoChips.solve(new int[] {7,4,10}));
        assertEquals(18, CasinoChips.solve(new int[] {12,12,12}));
        assertEquals(3, CasinoChips.solve(new int[] {1,23,2}));
    }

}