fun main() {
    // udah gak pakai index, pakainya key and value
    //immutable list of , data gak bisa diubah
    val istriRasul = mapOf(1 to "khadijah", 2 to "aisyah",  3 to "hafsah", 4 to "zainab")
    println(istriRasul[2])
    println(istriRasul)
    //untuk menampilkan lebih bagus
    istriRasul.forEach { (key, value) ->
        println("ID : $key, name : $value ") }

    //mutable list of , data  bisa diubah,  bisa memanggil lewat index
    val putriRasul = mutableMapOf(1 to "ruqayyah", 2 to "ummu kultsum", 3 to "zaenab")
    println(putriRasul[2])
    println(putriRasul)
    //menambah data collection
    putriRasul.put(4, "abdullah")
    println(putriRasul)
    // mengganti value
    putriRasul.replace(3,"qasim")
    println(putriRasul)
    //untuk menampilkan lebih bagus
    putriRasul.forEach { (key, value) ->
        println("ID : $key, name : $value ")
    }

}