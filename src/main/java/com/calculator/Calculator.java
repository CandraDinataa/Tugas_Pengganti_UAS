package com.calculator;

/**
 * Kelas kalkulator yang menyediakan operasi aritmatika dasar.
 */
public class Calculator {

    /**
     * Menjumlahkan dua bilangan.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil penjumlahan a dan b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Mengurangi bilangan kedua dari bilangan pertama.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil pengurangan a dikurang b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Mengalikan dua bilangan.
     *
     * @param a bilangan pertama
     * @param b bilangan kedua
     * @return hasil perkalian a dan b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Membagi bilangan pertama dengan bilangan kedua.
     *
     * @param a bilangan yang dibagi (dividend)
     * @param b bilangan pembagi (divisor)
     * @return hasil pembagian a dibagi b
     * @throws ArithmeticException jika b bernilai nol
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan");
        }
        return a / b;
    }

    /**
     * Menghitung pangkat dari sebuah bilangan.
     *
     * @param base  bilangan dasar
     * @param exponent pangkat
     * @return hasil base dipangkatkan exponent
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Menghitung akar kuadrat dari sebuah bilangan.
     *
     * @param a bilangan yang akan dihitung akar kuadratnya
     * @return akar kuadrat dari a
     * @throws ArithmeticException jika a bernilai negatif
     */
    public double sqrt(double a) {
        if (a < 0) {
            throw new ArithmeticException("Akar kuadrat bilangan negatif tidak didefinisikan");
        }
        return Math.sqrt(a);
    }

    /**
     * Menghitung modulus (sisa bagi) dari dua bilangan.
     *
     * @param a bilangan yang dibagi
     * @param b bilangan pembagi
     * @return sisa bagi a mod b
     * @throws ArithmeticException jika b bernilai nol
     */
    public double modulo(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Modulo dengan nol tidak diperbolehkan");
        }
        return a % b;
    }
}
