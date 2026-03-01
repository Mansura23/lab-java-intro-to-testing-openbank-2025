package org.ironhack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WarriorTest {
    private Warrior warrior;
    private Elf elf;

    @BeforeEach
    public void setUp()
    {
        warrior=new Warrior(50,30,20,10);
        elf=warrior.convertToElf();

    }
    @Test
    public void testWarrior()
    {
        assertNotNull(elf);
        assertEquals(50,elf.getHealth());
        assertEquals(30,elf.getStrength());
        assertEquals(20,elf.getLives());

    }
}
