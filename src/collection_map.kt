fun main() {
    /* memiliki 2 versi yakni :
    1. mutable
    2. dan immutable

    sudah tidak pakai index
    key dan value = list key
    dimana kita akan menyimpan nilai di program kotlin berdasarkan key dan valuenya
     */

    //versi imutable
    val members = mapOf(1 to "Tiyas", 2 to "aria", 3 to "pratiwi")
    println(members) //ngeprint semuanya
    println(members[3]) // ngeprint salah satu aja beibs , nah cara manggilnya ditulis si key nya

   /* for (key in members.keys) println(members.keys)
    members.forEach{
        (key, value) -> println("ID : $key, name : $value ")
    } */


    //versi mutable
    val members2 = mutableMapOf(1 to "Tiyas", 2 to "aria", 3 to "pratiwi")
    println(members2)
    println(members2 [2])

    //menambah data collection
    members2.put(4, "rangga")
    println(members2)

    // mengganti value
    members2.replace(3,"narendra")
    println(members2)

    //untuk menampilkan lebih bagus
    members2.forEach {
            (key, value) -> println("ID : $key, name : $value ")
    }


}