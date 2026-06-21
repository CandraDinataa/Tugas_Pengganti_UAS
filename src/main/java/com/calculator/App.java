package com.calculator;

/**
 * Kelas utama aplikasi kalkulator.
 */
public class App {

    /**
     * Metode utama yang menjalankan aplikasi kalkulator.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("=== Kalkulator Sederhana ===");
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
        System.out.println("10 * 5 = " + calc.multiply(10, 5));
        System.out.println("10 / 5 = " + calc.divide(10, 5));
        System.out.println("2 ^ 8 = " + calc.power(2, 8));
        System.out.println("sqrt(144) = " + calc.sqrt(144));
        System.out.println("10 mod 3 = " + calc.modulo(10, 3));
    }
}
