fun main() {
    val likes = 1201
    val lastDigit = likes % 10
    val lastTwoDigits = likes % 100
    if ((lastTwoDigits < 11 || lastTwoDigits > 19) && lastDigit == 1) {
        println("«Понравилось $likes человеку».")
    } else {
        println("«Понравилось $likes людям».")
    }
}