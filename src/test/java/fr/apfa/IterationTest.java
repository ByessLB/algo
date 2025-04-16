package fr.apfa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class IterationTest {

    @Test
    void verificationSommeDesEntiersDeZeroAN() {

        // TODO étant donné que la méthode sommeEntiers est déclarée en "public static" il n'est pas nécessaire d'avoir un objet de la classe Iteration pour l'appeler
        // tu peux directement appelée la méthode en utilisant le nom de la classe
        // par exemple : Iteration.sommeEntiers(3)

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

        // TODO même remarque qu'en ligne 12 pour l'appel de fonction
 
        // when
        int result = iteration.factorielle(10);
        // Then
        assertEquals(3628800, result);
    }
}
