package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IterationTest {

    @Test
    void verificationSommeDesEntiersDeZeroAN() {

        // When - Act
        int result = Iteration.sommeEntiers(3);

        // Then - Assert
        assertEquals(6, result);

        result = Iteration.sommeEntiers(4);
        assertEquals(10, result);

        result = Iteration.sommeEntiers(1);
        assertEquals(1, result);

        result = Iteration.sommeEntiers(-1);
        assertEquals(0, result);
    }

    @Test
    void verificationCalculFactorielle() {
        // Given
        Iteration iteration = new Iteration();
        // when
        int result = iteration.factorielle(10);
        // Then
        assertEquals(3628800, result);
    }
}
