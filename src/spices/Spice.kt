package spices
fun main (){
   delegate()
   // makeSpice()
}

fun delegate(){
    val myCurry = Curry(name = "rojo", spiciness = "hot")
    println("Curry ${myCurry.name} es de color ${myCurry.color}")
}

sealed class Spice (val name : String,
             val spiciness : String = "mild", color : SpiceColor): SpiceColor by color {
    private val heat
        get() = heatLevel()

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

    abstract fun prepareSpice()
}

class Curry(name: String, spiciness: String, color: SpiceColor = YellowSpiceColor) : Spice(name,spiciness,color), Grinder {

    override fun grind() {
        print("$name curry grinded")
    }
    override fun prepareSpice() {
        grind()
    }
}

interface Grinder{
    fun grind()
}

interface SpiceColor{
    val color : Color
}

object YellowSpiceColor : SpiceColor{
    override val color = Color.YELLOW
}

data class SpiceContainer(var spice: Spice) {
    val label = spice.name
}

fun makeSpice() {
    val spiceCabinet = listOf(
        SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")), SpiceContainer
            (Curry("Green Curry", "spicy"))
    )

    for (element in spiceCabinet) println(element.label)
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF),YELLOW(0XFFFF00);
}