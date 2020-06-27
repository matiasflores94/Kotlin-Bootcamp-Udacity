fun main(arg : Array<String>){

    print(whatShouldIDoToday(mood = getMood()))
}

fun getMood() : String {
    println("Enter your mood:")
    return readLine().toString()
}


fun whatShouldIDoToday(mood : String, weather : String = "sunny", temperature : Int = 24) : String{

    fun walkinTime(mood : String, weather: String) = mood == "happy" && weather == "sunny"
    fun stayInBed (mood: String, weather: String, temperature: Int ) = mood == "sad" && weather == "rainy" && temperature == 0
    fun swimming(temperature: Int) = temperature > 35
    return when{
        walkinTime(mood, weather)-> "Go for a walk"
        stayInBed (mood, weather, temperature) -> "stay in bed"
        swimming(temperature)-> "go swimming"
        else -> "Stay home and read"
    }
}