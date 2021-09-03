fun main() {
    val seats = arrayOf(
        intArrayOf(1, 10, 100),
        intArrayOf(2, 20, 200),
        intArrayOf(3, 30, 300)
    )
    /*
    indexnya  diurutkan
    00 01 02
    10 11 12
    20 21 22
     */
    // mau ngeprintln yang 20 jadi ..
    println(seats[1][1])

    // untuk mengganti data dari si array
    seats [2][0] = 50

    // untuk menampilakn semua isi dari si array
    for (baris in seats) {
        for (aray in baris) println(aray)
    }
}