package org.ironhack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

public class WizardTest {


    @Test
    public void WizardTestMockito(){
        SpellLibrary mockSpellLibrary = Mockito.mock(SpellLibrary.class);

        when(mockSpellLibrary.getRandomSpell()).thenReturn("Fireball");

        Wizard wizard = new Wizard(80, 15, 2, "Default Spell", mockSpellLibrary);

        String result = wizard.castRandomSpell();

        verify(mockSpellLibrary, times(1)).getRandomSpell();

        assertEquals("Casting Fireball", result, "The spell string should match the stubbed mock output");

    }


}
