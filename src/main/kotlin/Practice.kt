import kotlin.random.Random

fun main(){

    println("This is a guessing game, you have 6 tries to guess a number between 0 and 100")

    val number: Int = Random.nextInt(from = 0, until = 100)
    var count: Int = 1
    var guess: Int
    println("Take a guess")
    println(number)
    while(count <= 6) {
        guess = readln().toInt()

        if (guess == number) break

        else if(guess < number) {
            println("Nice try, your guess is smaller than the expected number")
            println("Take another guess")
        } else if (guess > number) {
            println("Nice try but your guess is larger than the expected number")
            println("Take another guess")
        }
        count++
    }
}

