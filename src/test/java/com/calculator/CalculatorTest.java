package com.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Kelas pengujian unit untuk Calculator.
 */
@DisplayName("Unit Test Kalkulator")
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // ========== TEST PENJUMLAHAN ==========

    @Test
    @DisplayName("Penjumlahan dua bilangan positif")
    void testAddPositiveNumbers() {
        assertEquals(15.0, calculator.add(10, 5), "10 + 5 harus = 15");
    }

    @Test
    @DisplayName("Penjumlahan dengan bilangan negatif")
    void testAddWithNegativeNumber() {
        assertEquals(5.0, calculator.add(10, -5), "10 + (-5) harus = 5");
    }

    @Test
    @DisplayName("Penjumlahan dua bilangan negatif")
    void testAddTwoNegativeNumbers() {
        assertEquals(-15.0, calculator.add(-10, -5), "(-10) + (-5) harus = -15");
    }

    @Test
    @DisplayName("Penjumlahan dengan nol")
    void testAddWithZero() {
        assertEquals(10.0, calculator.add(10, 0), "10 + 0 harus = 10");
    }

    @Test
    @DisplayName("Penjumlahan bilangan desimal")
    void testAddDecimalNumbers() {
        assertEquals(5.5, calculator.add(2.5, 3.0), 0.001, "2.5 + 3.0 harus = 5.5");
    }

    // ========== TEST PENGURANGAN ==========

    @Test
    @DisplayName("Pengurangan dua bilangan positif")
    void testSubtractPositiveNumbers() {
        assertEquals(5.0, calculator.subtract(10, 5), "10 - 5 harus = 5");
    }

    @Test
    @DisplayName("Pengurangan menghasilkan bilangan negatif")
    void testSubtractResultNegative() {
        assertEquals(-5.0, calculator.subtract(5, 10), "5 - 10 harus = -5");
    }

    @Test
    @DisplayName("Pengurangan dengan nol")
    void testSubtractWithZero() {
        assertEquals(10.0, calculator.subtract(10, 0), "10 - 0 harus = 10");
    }

    // ========== TEST PERKALIAN ==========

    @Test
    @DisplayName("Perkalian dua bilangan positif")
    void testMultiplyPositiveNumbers() {
        assertEquals(50.0, calculator.multiply(10, 5), "10 * 5 harus = 50");
    }

    @Test
    @DisplayName("Perkalian dengan nol")
    void testMultiplyWithZero() {
        assertEquals(0.0, calculator.multiply(10, 0), "10 * 0 harus = 0");
    }

    @Test
    @DisplayName("Perkalian bilangan negatif")
    void testMultiplyNegativeNumbers() {
        assertEquals(50.0, calculator.multiply(-10, -5), "(-10) * (-5) harus = 50");
    }

    @Test
    @DisplayName("Perkalian positif dan negatif")
    void testMultiplyPositiveAndNegative() {
        assertEquals(-50.0, calculator.multiply(10, -5), "10 * (-5) harus = -50");
    }

    // ========== TEST PEMBAGIAN ==========

    @Test
    @DisplayName("Pembagian dua bilangan positif")
    void testDividePositiveNumbers() {
        assertEquals(2.0, calculator.divide(10, 5), "10 / 5 harus = 2");
    }

    @Test
    @DisplayName("Pembagian menghasilkan desimal")
    void testDivideResultDecimal() {
        assertEquals(2.5, calculator.divide(5, 2), 0.001, "5 / 2 harus = 2.5");
    }

    @Test
    @DisplayName("Pembagian dengan nol harus melempar exception")
    void testDivideByZeroThrowsException() {
        ArithmeticException exception = assertThrows(
            ArithmeticException.class,
            () -> calculator.divide(10, 0),
            "Pembagian dengan nol harus melempar ArithmeticException"
        );
        assertTrue(exception.getMessage().contains("nol"),
            "Pesan exception harus menyebutkan 'nol'");
    }

    @Test
    @DisplayName("Pembagian bilangan negatif")
    void testDivideNegativeNumbers() {
        assertEquals(2.0, calculator.divide(-10, -5), "(-10) / (-5) harus = 2");
    }

    // ========== TEST PANGKAT ==========

    @Test
    @DisplayName("Pangkat dua bilangan positif")
    void testPowerPositiveExponent() {
        assertEquals(256.0, calculator.power(2, 8), "2^8 harus = 256");
    }

    @Test
    @DisplayName("Pangkat nol")
    void testPowerZeroExponent() {
        assertEquals(1.0, calculator.power(5, 0), "5^0 harus = 1");
    }

    @Test
    @DisplayName("Pangkat satu")
    void testPowerOneExponent() {
        assertEquals(5.0, calculator.power(5, 1), "5^1 harus = 5");
    }

    @Test
    @DisplayName("Pangkat negatif")
    void testPowerNegativeExponent() {
        assertEquals(0.25, calculator.power(2, -2), 0.001, "2^(-2) harus = 0.25");
    }

    // ========== TEST AKAR KUADRAT ==========

    @Test
    @DisplayName("Akar kuadrat bilangan positif")
    void testSqrtPositiveNumber() {
        assertEquals(12.0, calculator.sqrt(144), "sqrt(144) harus = 12");
    }

    @Test
    @DisplayName("Akar kuadrat dari nol")
    void testSqrtZero() {
        assertEquals(0.0, calculator.sqrt(0), "sqrt(0) harus = 0");
    }

    @Test
    @DisplayName("Akar kuadrat bilangan negatif harus melempar exception")
    void testSqrtNegativeNumberThrowsException() {
        assertThrows(
            ArithmeticException.class,
            () -> calculator.sqrt(-1),
            "Akar kuadrat bilangan negatif harus melempar ArithmeticException"
        );
    }

    @Test
    @DisplayName("Akar kuadrat bilangan desimal")
    void testSqrtDecimalNumber() {
        assertEquals(1.5, calculator.sqrt(2.25), 0.001, "sqrt(2.25) harus = 1.5");
    }

    // ========== TEST MODULO ==========

    @Test
    @DisplayName("Modulo bilangan positif")
    void testModuloPositiveNumbers() {
        assertEquals(1.0, calculator.modulo(10, 3), "10 mod 3 harus = 1");
    }

    @Test
    @DisplayName("Modulo dengan hasil nol")
    void testModuloResultZero() {
        assertEquals(0.0, calculator.modulo(10, 5), "10 mod 5 harus = 0");
    }

    @Test
    @DisplayName("Modulo dengan nol harus melempar exception")
    void testModuloByZeroThrowsException() {
        assertThrows(
            ArithmeticException.class,
            () -> calculator.modulo(10, 0),
            "Modulo dengan nol harus melempar ArithmeticException"
        );
    }
}
