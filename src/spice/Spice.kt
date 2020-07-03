package spice

class Spice (val name : String,
             val spiciness : String = "mild" ) {
    val heat  = heatLevel()

    private fun heatLevel() : Int =
        when(spiciness){
            "mexico" -> 10
            "hell" -> 9
            "hot" -> 8
            "spicy" -> 7
            "medium" -> 6
            "mild" -> 5
            else -> 0
        }

    init {
        println("Name: $name, spiciness: $spiciness, heat level: $heat.")
    }
    fun isSpicy() : Boolean = heat > 6

}
fun makeSalt() = Spice(name = "Salt", spiciness = "Es sal...")
