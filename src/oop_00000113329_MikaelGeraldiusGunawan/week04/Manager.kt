package oop_00000113329_MikaelGeraldiusGunawan.week04

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary) {

    final override fun work(){
        println("$name sedang memimpin rapat divisi")
    }

    final override fun calculateBonus(): Double {
        return super.calculateBonus() + 500000
    }
}