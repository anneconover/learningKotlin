import java.util.*

fun main(args: Array<String>) {
    print("Hello, ${args[0]}!")
    feedTheFish()
    val fortune = getFortuneCookie()
    println("Your fortune is: $fortune")
}

fun feedTheFish() {
    val day = randomDay()
    val food = "pellets"
    println ("Today is $day and the fish eat $food")
}

fun randomDay() : String {
    val week = listOf ("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun getFortuneCookie() : String {
    val fortunes = listOf ("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    println("Enter your birthday: ")
    var birthday = readLine()!!.toIntOrNull() ?: 1
    val num = birthday % fortunes.size
    return fortunes.elementAt(num)
}