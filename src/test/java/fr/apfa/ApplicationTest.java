package fr.apfa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ApplicationTest {

    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    void shouldVerifyIfIsAdult() {

        assertTrue(Application.isAdult(2000));

        assertFalse(Application.isAdult(2020));

        assertTrue(Application.isAdult(1920));

        assertFalse(Application.isAdult(-1));

        assertFalse(Application.isAdult(4020));

    }
}
