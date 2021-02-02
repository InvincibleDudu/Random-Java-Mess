package codewars.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareNumTest {

    @Test
    public void basicTests(){
        assertEquals(-1,SquareNum.solve(1));
        assertEquals(-1,SquareNum.solve(2));
        assertEquals(1,SquareNum.solve(3));
        assertEquals(-1,SquareNum.solve(4));
        assertEquals(4,SquareNum.solve(5));
        assertEquals(9,SquareNum.solve(7));
        assertEquals(1,SquareNum.solve(8));
        assertEquals(16,SquareNum.solve(9));
        assertEquals(-1,SquareNum.solve(10));
        assertEquals(25,SquareNum.solve(11));
        assertEquals(36,SquareNum.solve(13));
        assertEquals(64,SquareNum.solve(17));
        assertEquals(5428900,SquareNum.solve(88901));
        assertEquals(429235524,SquareNum.solve(290101));
    }

}