package oop_00000113329_MikaelGeraldiusGunawan.week04

open class Employee(val name: String, val baseSalary: Int) {

    open fun work(){
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Double {
        return baseSalary * 0.10
    }
}