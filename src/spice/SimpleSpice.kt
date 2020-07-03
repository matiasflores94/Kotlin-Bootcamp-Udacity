package spice

class SimpleSpice() {
    var spiceName : String = "curry"
    var spiciness : String = "mild"
    var heat : Int
        get() = heatLevel(spiciness)
        set(value) {}

    private fun heatLevel(spiciness : String) : Int{
       return when(spiciness){
            "mild" -> 5
            else -> 0
        }
    }
}