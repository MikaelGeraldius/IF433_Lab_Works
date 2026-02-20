package oop_00000113329_MikaelGeraldiusGunawan.week03

class Employee(var name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            this.salary = value
        }
}