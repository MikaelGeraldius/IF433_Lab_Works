package oop_00000113329_MikaelGeraldiusGunawan.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("---UCUP SI PETUALANG---")
    println("Create your character:")

    print("Masukkan nama: ")
    val name = scanner.nextLine()

    print("Masukkan damage: ")
    val damage = scanner.nextInt()
    scanner.nextLine()

    val player1 = Hero(name= name, baseDamage = damage)

    var enemyHp = 100

    while (enemyHp > 0) {
        println("Choose your action:")
        println("1. Serang")
        println("2. Kabur")
        val pilihan = scanner.nextInt()
        scanner.nextLine()
        if (pilihan == 1){
            enemyHp -= player1.baseDamage
            println("Enemy hp berkurang sebanyak ${player1.baseDamage}")
            println("Enemy hp tersisa $enemyHp")
        } else if (pilihan == 2){
            val chance = (0..100).random()
            if (chance > 30) {
                println("Player berhasil kabur")
                break
            } else {
                println("Player gagal kabur")
            }
        } else {
            println("Tidak ada pilihan")
        }
        val enemyDamage = (10..20).random()
        player1.takeDamage(enemyDamage)
        println("Enemy membalas dengan $enemyDamage damage")
        println("HP player sisa ${player1.hp}")
    }
}