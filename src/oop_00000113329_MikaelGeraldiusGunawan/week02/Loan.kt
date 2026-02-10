package oop_00000113329_MikaelGeraldiusGunawan.week02

class Loan(
    val bookTitle: String,
    val borrower: String,
    val loanDuration: Int = 1
){
    fun calculateFine(loanDuration: Int): Int {
        return if (loanDuration > 3) {
            (loanDuration - 3) * 2000
        } else {
            0
        }
    }

    constructor(bookTitle: String, borrower: String) : this(bookTitle, borrower, loanDuration = 1) {
        println("Berhasil membuat buku")
    }
}