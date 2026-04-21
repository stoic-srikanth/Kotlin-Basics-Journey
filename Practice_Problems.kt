//Identify the error (use of different brackets in print line command) in while compiling and fixing the error to get the output as "New chat message from a friend".

fun main() {
    println("New chat message from a friend")
}

//Initially the values were assigned to read only variable which caused the error hence changed them to var.

fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    var item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}

//Initially the values 20 and 30 were within "" quotes which prevented them from being considered as int and + operator gave the output as 2030.

fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

//The program shows the output in split format of 5000 + 1000 (additional bonus).

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

//Add and subtract by defining and calling a function.

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

fun add(a: Int, b: Int): Int {
    return a + b
    
}

fun subtract(a: Int, b: Int): Int {
    return a - b

}

//To create and use the function to display alert message to different OS users. 

fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}
fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in on $operatingSystem for your Google Account $emailId."
}

//Compare 2 numbers (in this case time spent on phone) and return Boolean value.

fun main() {
    println(compareTime(300, 250)) 
    println(compareTime(200, 200)) 
    println(compareTime(150, 200)) 
}
fun compareTime(today: Int, yesterday: Int): Boolean {
    return today > yesterday
}

//Program to remove the possibility of error due to same usage of terms (city, low/high temperature, chance of rain).

fun main() {
    
    printWeatherDetails("Ankara", 27, 31, 82)
    printWeatherDetails("Tokyo", 32, 36, 10)
    printWeatherDetails("Cape Town", 59, 64, 2)
    printWeatherDetails("Guatemala City", 50, 55, 7)
}


fun printWeatherDetails(city: String, low: Int, high: Int, rain: Int) {
    println("City: $city")
    println("Low temperature: $low, High temperature: $high")
    println("Chance of rain: $rain%")
    println() 
}
