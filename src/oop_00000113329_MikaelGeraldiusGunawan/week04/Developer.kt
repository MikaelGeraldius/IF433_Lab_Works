package oop_00000113329_MikaelGeraldiusGunawan.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String): Employee(name, baseSalary) {

    final override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage")
    }
}