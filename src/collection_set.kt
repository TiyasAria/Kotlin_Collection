fun main() {
    /*
    collecttaion set
    1. datanya harus unique = tidak boleh sama, tidak boleh berurut
    saat masukin data duplicate maka tidak akan keinput, karena hanya bisa menyimpan satu data,
    
     */

    //versi immutable
    val moms = setOf("oca", "diva", "tiyas", "elsa")
    println(moms.toList())

    //versi mutable
    val moms2 = mutableSetOf("oca", "diva", "tiyas", "elsa", "rifdah")
    moms2.add ("shofi")
    println(moms2.toList())


}