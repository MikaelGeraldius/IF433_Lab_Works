package oop_00000113329_MikaelGeraldiusGunawan.week02

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("----LIBRARY INPUT SYSTEM----")

    print("Input judul: ")
    var judul = scanner.nextLine()

    print("Input nama peminjam: ")
    var nama = scanner.nextLine()

    print("Input lama pinjam (dalam hari): ")
    var lama = scanner.nextInt()

    scanner.nextLine()

    if (lama <= 0) {
        val l2 = Loan(judul, nama)
    } else {
        val l1 = Loan(judul, nama, lama)
    }
}