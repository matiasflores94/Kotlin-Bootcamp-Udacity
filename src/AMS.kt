import java.util.*
/* -----------DAY OF WEEKK----------
fun main(args: Array<String>){
    println("Hello, world!")
    dayOfWeek()
}

fun dayOfWeek(){
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)

    println("Today is ${when(day){
        1 -> "Sunday"
        2 -> "Lunes"
        3 -> "Tercera"
        4 -> "Miercoles"
        5 -> "Jueves"
        6 -> "vienardo"
        7 -> "Sabadoom"
        else -> "Erroooorr"
    }}")
}
*/
/* --------dia RAAANDOMOMM ----
fun main (arg : Array<String>){
  //  println(if(arg[0].toInt() < 12 ) "Good Morning, Kotlin." else "Good night, Kotlin.")
    feedTheFish()
}

fun feedTheFish(){
    val day = randomDay()
    val food = "pellets"
    println("Todas is $day and the fish eat $food")
}

fun randomDay() : String{
    val week = listOf("Monday","MAr", "mier", "jueve", "Vier", "Saba","dom")
    return week[Random().nextInt(7)]
}

*/

//-----------Fortuuunaaa --------------
fun main (arg : Array<String>){
    var fortune : String
    var i = 0
    do {
        fortune = getFortuneCookie(getBirthday())
        println("Your fortune is: $fortune ")
        i++
    } while(!fortune.contains("Take it easy")&& i <10)
}

fun getBirthday() : Int {
    println("Enter your birthday:")

    return readLine()?.toIntOrNull() ?: 1
}

fun getFortuneCookie(birthday : Int) : String {
    val fortunes = listOf<String>(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")

    val fortuneIndex : Int = when(birthday){
        in 1..7 -> birthday.times(5).rem(fortunes.size)
        28,31 -> Random().nextInt(fortunes.size)
        else -> birthday.rem(fortunes.size)
    }
    return fortunes[fortuneIndex]
    }


/*--------PescadPPPOOSS --------------
fun main(arg : Array<String>){
    feedTheFish()
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    if (shouldChangeWater(day)) {
        println("Change the water today.")
    }
    swim()
    print(canAddFish(10, listOf(3,3,3)))
    print(canAddFish(8, listOf(2,2,2), hasDecorations = false))
            print(canAddFish(9, listOf(1,1,3), 3))
            print(canAddFish(10, listOf(), 7, true))

}

fun swim(speed : String = "fast"){
    println("swimming $speed")
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood(day : String) : String {
    return when(day){
        "Monday" -> "pinga"
        "Tuesday" -> "pingo"
        "Wednesday" -> "pingu"
        "Thursday" -> "redworms"
        "Friday" -> "flakes"
        "Saturday" -> "pallets"
        "Sunday" -> "Flokolos"
        else -> "fasting"
    }
}

fun shouldChangeWater(
    day: String,
    temperature : Int = 22,
    dirty : Int = 20
) : Boolean{
    return true
}

fun canAddFish(tankSize : Int,
                currentFish : List<Int>, //largo de cada pez del tank
                fishSize : Int = 2, //en inches, o sea pulgadas
                hasDecorations : Boolean = true) : Boolean{
        return currentFish.sum() + fishSize <= tankSize.times(if(hasDecorations) 0.8 else 1.0)
}
*/