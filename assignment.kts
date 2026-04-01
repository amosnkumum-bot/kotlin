// Name: AMOS SADALA 

fun main() {

    // =========================
    // Section 1: Variables & Data Types
    // =========================

    // Task 1.1
    var studentName: String = "Sadala Nkumum" // mutable
    val studentId: Int = 2024001           // immutable
    var GPA: Double = 3.75                // mutable
    val isEnrolled: Boolean = true        // immutable
    val middleInitial: Char = 'J'         // immutable

    // Task 1.2
    val studentInfo = "Student: $studentName $middleInitial. (ID: $studentId) has GPA $GPA and is enrolled: $isEnrolled"
    println(studentInfo)

    // Task 1.3
    var phoneNumber: String? = null
    println("Phone Number: ${phoneNumber ?: "No phone number"}")

    // =========================
    // Section 2: Functions
    // =========================

    displayMenu()

    val discountedPrice = calculateDiscount(100.0, 15.0)
    println("Discounted Price: $discountedPrice")

    println("Grade for 78: ${getGrade(78)}")

    println("Is 4 even? ${isEven(4)}")

    // =========================
    // Section 3: Conditional Statements
    // =========================

    // Task 3.1
    val temps = listOf(35, 25, 15)
    for (temperature in temps) {
        if (temperature > 30) {
            println("$temperature -> Hot day")
        } else if (temperature in 20..30) {
            println("$temperature -> Perfect weather")
        } else {
            println("$temperature -> Cool day")
        }
    }

    // Task 3.2 (when expression)
    val dayOfWeek = "Monday"
    when (dayOfWeek) {
        "Saturday", "Sunday" -> println("Weekend! Time to relax")
        "Monday" -> println("Back to work")
        "Friday" -> println("TGIF!")
        else -> println("Regular weekday")
    }

    // Task 3.3
    val trafficLight = "RED"
    val trafficAction = when (trafficLight) {
        "RED" -> "STOP"
        "YELLOW" -> "CAUTION"
        "GREEN" -> "GO"
        else -> "INVALID"
    }
    println("Traffic Action: $trafficAction")

    // =========================
    // Section 4: Loops
    // =========================

    // Task 4.1
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }

    // Task 4.2
    var count = 5
    do {
        println("Countdown: $count")
        count--
    } while (count >= 1)
    println("Blast off!")

    // Task 4.3
    val shoppingList = listOf("Milk", "Eggs", "Bread", "Butter", "Coffee")
    for ((index, item) in shoppingList.withIndex()) {
        println("[${index + 1}] $item")
    }

    // Task 4.4
    println("1 to 20 inclusive:")
    for (n in 1..20) println(n)

    println("1 to 20 excluding 20:")
    for (n in 1 until 20) println(n)

    println("Even numbers from 2 to 20:")
    for (n in 2..20 step 2) println(n)

    println("Letters A to Z:")
    for (c in 'A'..'Z') println(c)

    // =========================
    // Section 5: Statements vs Expressions
    // =========================

    // Task 5.2
    val age = 20
    val status = if (age >= 18) "Adult" else "Minor"
    println("Status: $status")

    // Task 5.3
    val a = 10
    val b = 25
    val maxNumber = if (a > b) a else b
    println("Max Number: $maxNumber")

    // =========================
    // Section 6: Integration Challenge
    // =========================

    displayAllStudents()
    println("Average Score: ${getAverageScore()}")
    println("Top Student: ${findTopStudent()}")
    classifyStudents()

    // =========================
    // Bonus Challenge (Optional)
    // =========================

    // Uncomment to run calculator
    // simpleCalculator()
}


// =========================
// Section 2 Functions
// =========================

// Task 2.1
fun displayMenu() {
    println("=== MENU ===")
    println("1. View Profile")
    println("2. Edit Settings")
    println("3. Logout")
    println("============")
}

// Task 2.2
fun calculateDiscount(price: Double, discountPercent: Double): Double {
    return price - (price * discountPercent / 100)
}

// Task 2.3
fun getGrade(score: Int): String {
    return when (score) {
        in 80..100 -> "A"
        in 65..79 -> "B"
        in 50..64 -> "C"
        in 35..49 -> "D"
        else -> "F"
    }
}

// Task 2.4 (single-expression function)
fun isEven(number: Int): Boolean = number % 2 == 0


// =========================
// Section 6 Data & Functions
// =========================

val students = listOf(
    "Sabaya" to 85,
    "Ian" to 42,
    "Chebet" to 67,
    "Sanau" to 91,
    "Robert" to 38
)

// 1
fun displayAllStudents() {
    println("All Students:")
    for ((name, score) in students) {
        println("$name -> $score")
    }
}

// 2
fun getAverageScore(): Double {
    var total = 0
    for ((_, score) in students) {
        total += score
    }
    return total.toDouble() / students.size
}

// 3
fun findTopStudent(): String {
    var topName = ""
    var highest = 0
    for ((name, score) in students) {
        if (score > highest) {
            highest = score
            topName = name
        }
    }
    return topName
}

// 4
fun classifyStudents() {
    println("Student Classification:")
    for ((name, score) in students) {
        println("Name: $name, Score: $score, Grade: ${getGrade(score)}")
    }
}


// =========================
// Bonus Calculator
// =========================

fun simpleCalculator() {
    println("Enter first number:")
    val num1 = readln().toDouble()

    println("Enter second number:")
    val num2 = readln().toDouble()

    println("Enter operation (+, -, *, /):")
    val op = readln()

    val result = when (op) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else {
            println("Error: Division by zero")
            return
        }
        else -> {
            println("Invalid operation")
            return
        }
    }

    println("Result: $result")

}