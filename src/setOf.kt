fun main() {
    // remind : untuk set datanya gak boleh sama (unique), kalau sama hanya 1 aja yg ke bakal ke println

    //immutable set of , data gak bisa diubah,  gak bisa memanggil lewat index
    val istriRasul = setOf("khadijah", "aisyah", "hafsah", "saudah", "zainab")
    println(istriRasul.toList())

    //mutable list of , data  bisa diubah,  gak bisa memanggil lewat index
    val putriRasul = mutableSetOf("ruqayyah", "ummu kultsum", "zaenab")
    putriRasul.add("fatimah")
    println(putriRasul.toList())

}