package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IterationTest {

    @Test
    void verificationSommeDesEntiersDeZeroAN() {
        // Given - Arrange
        Iteration iteration = new Iteration();

        // When - Act
        int result = iteration.sommeEntiers(3);

        // Then - Assert
        assertEquals(6, result);
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
