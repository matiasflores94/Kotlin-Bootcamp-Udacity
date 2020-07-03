package spice

fun main(args : Array<String>){
    buildSpiceList()
}

fun buildSpiceList(){
    val spiceList = listOf<Spice>(
                Spice(name="curry", spiciness = "medium"),
                Spice(name="Pepper", spiciness = "medium"),
                Spice(name="Cayenne", spiciness = "hot"),
                Spice(name= "ginger"),
                Spice(name= "Red curry", spiciness = "hell"),
                Spice(name= "Green curry"),
                Spice(name= "Red pepper", spiciness = "mexico"),
                makeSalt())
    println(spiceList.filter { it.isSpicy().not() }.map { it.name })
}

fun buildSpice(){
    var mySpice = SimpleSpice()

    println("My spice : ${mySpice.spiceName}"+
            "Heat: ${mySpice.heat}")
}