package oop_00000113329_MikaelGeraldiusGunawan.week03

fun main() {
    val e = Employee("Budi")

    e.salary = 5000000
    println("Gaji: ${e.salary}")

    e.increasePerformanceRating()

    println("Pajak yang harus dibayar: ${e.tax}")
}