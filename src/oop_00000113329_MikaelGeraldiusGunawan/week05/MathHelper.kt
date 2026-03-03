package oop_00000113329_MikaelGeraldiusGunawan.week05

abstract class MathHelper() {
    abstract fun hitungLuas()

    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}