package oop_00000113329_MikaelGeraldiusGunawan.week05

class Ewallet(accountName: String, var balance: Double):PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance > amount) {
            balance -= amount
            println("Sukses")
        }
        else {
            println("Saldo tidak cukup")
        }
    }

    fun topUp(amount: Double) {
        balance += amount
    }
}