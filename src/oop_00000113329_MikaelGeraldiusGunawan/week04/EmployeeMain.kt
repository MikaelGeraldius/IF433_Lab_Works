package oop_00000113329_MikaelGeraldiusGunawan.week04

fun main() {
    println("---Manager---")
    val manager = Manager(name = "Gege", baseSalary = 10000000)
    manager.work()
    println("Bonus : ${manager.calculateBonus()}")

    println("---Developer---")
    val developer = Developer(name = "Gerald", baseSalary = 5000000, programmingLanguage = "Kotlin")
    developer.work()
    println("Bonus : ${developer.calculateBonus()}")
}