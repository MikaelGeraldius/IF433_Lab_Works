package oop_00000113329_MikaelGeraldiusGunawan.week08

class Alamat(val kota: String?)
class Mahasiswa(val address: Alamat)

fun main() {
    val mhs1 = Mahasiswa(Alamat("Tanggerang"))
    val mhs2 = Mahasiswa(Alamat(null))

    println("Mahasiswa1: ${mhs1.address.kota}")
    println("Mahasiswa2: ${mhs2.address.kota}")

    var tetapAlamat = Alamat(null)
    var defaultAlamat = tetapAlamat.kota?: "Alamat kamu kosong"
    println("Alamat kamu ${defaultAlamat}")

    tetapAlamat = Alamat("Jakarta")
    defaultAlamat = tetapAlamat.kota?.let {
        adrs->"Alamatnya adalahh $adrs"
    } ?: "Alamat kamu kosong"
    println("${defaultAlamat}")

}
