fun main() {
    /*
    fungsi ajaib di collection :
    1. any = mengembalikan nilai true jika salah satu element benar
    2. all = mengembalikan nilai true jika semua element benar
    3. non = mengembalikan nilai true jika semua element  tidak benar(false)
     */

    val text = listOf("narendra", "rangga", "reswara")

    // uji coba any
    val hasilAny = text.any {
        it.contains("res")
    }
    if (hasilAny) println("benar")
    else println("salah")

    // uji coba all
    val hasilAll = text.all {
        it.contains("ra")
    }
    if (hasilAll) println("benar")
    else println("salah")

    // uji coba any
    val hasilNone = text.none {
        it.contains("tiyas")
    }
    if (hasilNone) println("benar")
    else println("salah")

    // mencoba yang angka
    val angka = listOf(2,4,6)

    // uji coba any
    val hasilAny1 = angka.all {
        it % 2 == 0
    }
    if (hasilAny1) println("benar")
    else println("salah")


}