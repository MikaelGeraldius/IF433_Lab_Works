package oop_00000113329_MikaelGeraldiusGunawan.week05

fun main() {
    val ewallet1 = Ewallet(accountName = "GegeGopay", balance = 50000.0)
    val credit1 = CreditCard(accountName = "GegeCredit", limit = 100000.0)

    val daftarPaymentMethod : List<PaymentMethod> = listOf(ewallet1, credit1)

    for (i in daftarPaymentMethod) {
        i.processPayment(75000.0)

        when (i) {
            is Ewallet -> {
                i.topUp(50000.0)
                i.processPayment(75000.0)
            }
        }
    }
}