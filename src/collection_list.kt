fun main() {
    /*
    collection list memiliki 2 versi :
    1. mutable : datanya bisa diubah
    2. immutable : data  gak boleh diubah
    list sama seperti array jadi memanggilnya bisa pakai index, dan bisa memasukan data berkali-kali
    yang sama
     */

    //versi immutable , data boleh sama / kembar (duplicate), bisa diurutkan berdasarkan index,data gak bisa diubah
    val members = listOf("khadijah", "muhammad", "fatimah", "asiyah", "fatimah")
    println(members[3])
    println(members.toList())

    // versi mutable, data  boleh sama,bisa diubah datanya yakni dengan nambahin add
    val vegetables = mutableListOf("sawi", "kangkung", "bayam", " sayur kol", "wortel", "wortel")
    vegetables.add("loncang")

    println(vegetables.toList())

}