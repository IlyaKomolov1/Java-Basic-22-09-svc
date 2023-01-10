package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceImplTest {

    @Test
    public void testDiceRoll() {
        DiceImpl dice = new DiceImpl();
        int roll = dice.roll();
        assertTrue(roll>=1);
        assertTrue(roll<=6);
    }
}