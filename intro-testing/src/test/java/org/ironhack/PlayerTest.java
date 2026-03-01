package org.ironhack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    private Warrior warrior;
    private Elf elf1;

    @BeforeEach
    public void setUp()
    {
        warrior=new Warrior(50,20,30,10);
        elf1=new Elf(25,30,15,10);

    }

    @Test
    public void playerTest()
    {
        warrior.attack(elf1);

        assertEquals(16,elf1.getLives());
        assertEquals(25,elf1.getHealth());
    }
}
