package com.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Kelas pengujian unit untuk App.
 */
@DisplayName("Unit Test App")
public class AppTest {

    /**
     * Test bahwa main method berjalan tanpa exception.
     */
    @Test
    @DisplayName("Main method berjalan tanpa exception")
    void testMainRunsWithoutException() {
        assertDoesNotThrow(() -> App.main(new String[]{}),
            "App.main() harus berjalan tanpa melempar exception");
    }

    /**
     * Test bahwa App dapat diinstansiasi.
     */
    @Test
    @DisplayName("App dapat diinstansiasi")
    void testAppInstantiation() {
        App app = new App();
        assertNotNull(app, "Instance App tidak boleh null");
    }
}
