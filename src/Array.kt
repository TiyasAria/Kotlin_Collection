fun main() {
    println("CARA PERTAMA")
    // Array adalah kumpulan beberapa data yang dijadikan satu tempat
    val names =  arrayOf("ummi", "elsa", "oca", "rifdah", "shofi")
    //untuk mengeluarkan isi dari si array menggunakan perulangan for
    for(name in names) println(name)

    println("CARA KEDUA")
    // menggunakan integer dan konsep index
    val numbers = intArrayOf(1,2,3,4,5)
    for (number in numbers.indices) println(numbers[3])
    // indices berfungsi untuk memanggil data dari si array berdasarkan index

    println("CARA KETIGA")
    val nums = Array(4) {0}
    nums [0] = 10
    nums [1] = 9
    nums [2] = 8
    nums [3] = 7
    for (num in nums) println(num)

}