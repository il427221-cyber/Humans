fun main() {
    val likes = 1201
    val human = "человеку"
    val people = "людям"
    val lastDigit = likes % 10
    val lastTwoDigits = likes % 100
    if ((lastTwoDigits < 11 || lastTwoDigits > 19) && lastDigit == 1) {
        println ("«Понравилось " + likes + " " + human + "».")
    } else {
        println ("«Понравилось " + likes + " " + people + "».")
    }
}