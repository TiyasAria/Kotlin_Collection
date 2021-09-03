

val avangers = mutableMapOf("Ironman" to 100,
        "hulk" to 100, "catwomen" to 100, "batman" to 100)

fun main() {
    //add new pokemon (nama pokemon,power)
    println(avangers)
    nambahAvangers("spiderman",100)
    upgradeAvangers("catwomen",10)
    upgradeAvangers("spiderman",10)
    battleAvangers("catwomen","spiderman")

    println(avangers.toList())
}

fun battleAvangers(ave1: String, ave2: String) {
 val avangers1 = avangers[ave1]!!
 val avangers2 = avangers[ave2]!!
    /* if (avangers1 > avangers2)  {
        println("$ave1 menang gaess ")
        avangers.remove(ave2)
    } else if (avangers1 == avangers2) {
        println("$ave1 sama kuat dengan $ave2")
    } else  {
        println("$ave2 menang gaess ")
        avangers.remove(ave1)
    } */

    when {
        avangers1 > avangers2 -> {
            println("$ave1 menang gaess ")
            avangers.remove(ave2)
        }
        avangers1 == avangers2 -> println("$ave1 sama kuat dengan $ave2")
        else -> {
            println("$ave2 menang gaess ")
            avangers.remove(ave1)
        }
    }

}

fun nambahAvangers ( name : String, power : Int = 100){
    avangers.put(name,power)
    println("$name berhasil dibuat " )
}
fun upgradeAvangers ( name : String, power : Int){
    val newPower = avangers[name]!! + power
    avangers.replace(name,newPower)
    println("$name berhasil diperbarui dengan kekuatan $newPower " )
}