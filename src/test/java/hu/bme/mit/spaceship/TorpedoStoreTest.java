package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test
    void fire_MultipleFires() {
        // Arrange
        TorpedoStore store = new TorpedoStore(2);

        // Act
        boolean firstFireResult = store.fire(1);
        boolean secondFireResult = store.fire(1);

        // Assert
        assertEquals(true, firstFireResult);
        assertEquals(true, secondFireResult);
    }

}
