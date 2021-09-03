fun main() {

    /*
    ada 2 methode menarik saat kita membuat collection
    1. filter = menyaring beberapa list sesuai yang kita mau
    2. map = (bukan seperti collection map)
     */
    // filter untuk operasi perbandingan
    val numbers = listOf(1,10,50,100)
    val kurangDari50 = numbers.filter {
        it <= 50
    }
    println(kurangDari50.toList())
    println(numbers.toList())

// menggunakan map untuk operasi aritmatika
    val doubled = numbers.map {
        x -> x*2 // it *2 (bisa menggunakan rumus ini juga )
    }
    println(doubled)
}