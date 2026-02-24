package oop_00000113329_MikaelGeraldiusGunawan.week04

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Test Electric Car ---")
    val electric = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 100)
    electric.accelerate()
    electric.honk()
    electric.openTrunk()
}