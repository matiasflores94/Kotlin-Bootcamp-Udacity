package library

fun main(){
    //makeBook()
    mapSetPractice()
}

fun makeBook() {
    val myBook = Book()
    val info = myBook.titleByAuthorAndYear()
    print("Here is your book ${info.first} written by ${info.second} in ${info.third}")
}

fun mapSetPractice(){
    val allBooks = setOf("MacBeth","Romeo and Juliet","Hamlet")
    val library = mapOf("Shakespeare" to allBooks)
    println(library.any { it.value.contains("Hamlet") })

    val moreBooks = mutableMapOf<String, String>("Wilhelm Tell" to "Schiller")
    moreBooks.getOrPut("Jungle Book") { "Kipling"}
    moreBooks.getOrPut("Willhelm Tell") {"Shakespeare"}

    println(moreBooks)
    println(moreBooks.getOrPut("Jungle Book") { "Kipling"})
    moreBooks.getOrPut("Hamlet") {"Shakespeare"}
    println(moreBooks)
}

class Book(val title : String="Bruh", val author: String = "Guy",val year : Int=2020) {

    fun titleByAuthor(): Pair<String, String> {
        return Pair(title,author)
    }

    fun titleByAuthorAndYear() : Triple<String,String,Int>{
        return Triple(title,author,year)
    }
}