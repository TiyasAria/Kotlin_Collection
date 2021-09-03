fun main() {
    val words = listOf("hanya", "mengapa", "harus", "ketika", "bagaimana")
    //menampilkan hanya (yang pertama)
    val word = words.find {
        it.startsWith("ha")
    }
    println(word)

    //menampilakn harus (ha yang terakhir)
    val word2 = words.findLast {
        it.startsWith("ha")
    }
    println(word2)

    println(words.first()) // menampilkan yang pertama
    println(words.last()) // menapilkan yang terakhir
    println(words.sorted()) // memilih sesuai alfabet
    println(words.max()) // max = maximal , jika dia string maka mengambil huruf yang terakhir

}