package Aquarium

class Aquarium{
    var width : Int = 20
    var lenght : Int = 40
    var height : Int = 100
    var volume : Int
        get() = width * lenght * height / 1000
        set(value) {height = (value * 1000) / (lenght * width)}
}