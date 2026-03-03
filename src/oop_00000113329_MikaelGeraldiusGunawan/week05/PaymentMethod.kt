package oop_00000113329_MikaelGeraldiusGunawan.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}