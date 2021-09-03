fun main() {
    // remind : untuk list datanya boleh sama

    //immutable list of , data gak bisa diubah, bisa memanggil lewat index
    val istriRasul = listOf("khadijah", "aisyah", "hafsah", "saudah", "zainab", "hafsah")
    println(istriRasul[2])
    println(istriRasul.toList())

    //mutable list of , data  bisa diubah,  bisa memanggil lewat index
    val putriRasul = mutableListOf("ruqayyah", "ummu kultsum", "zaenab")
    putriRasul.add("fatimah")
    println(putriRasul[2])
    println(putriRasul.toList())
}
