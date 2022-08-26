//Declaring a Mutable Variable

fun main() {
  // Write your code below ☀️
  var todaysDate: String = "09/14/2001"
    println(todaysDate)

  var currentWeather: String
  currentWeather = "Sunny"
    println(currentWeather)
}


//Declaring an Immutable Variable

fun main() {
  // Write your code below
  val pi: Double = 3.14
  pi = 5.2
}


//Type Inference
fun main() {
  
  // Declare your variable above ⬆️
 var typeTest = "true" 
  print("${typeTest::class.simpleName}")    
}


//Variables
//String Concatenation

fun main() {
  val dog = "Toto"
  val state = "Kansas"
  val movie = "The Wizard of Oz"

println(dog + ", I've a feeling we're not in "+ state + " anymore. - " + movie + ", 1939")

}

//String Templates

fun main() {
  val plant = "orchid"
  val potSize = 6 // in inches 
  val dayNum = 7 

  // Write your code below 🌱
  println("An $plant in a $potSize inch pot must be watered every $dayNum days. ")

}

//User Input

fun main() {
  println("Please type your name and hit Enter.")
  var myName = readLine()
  
  println("Your name is $myName!")
  kotlinc MyFile.kt -include-runtime -d MyFile.jar
}


//Built-in Properties and Functions

fun main() {
  var word = "supercalifragilisticexpialidocious"
  
  // Write your code below ☂️
   word = word.capitalize()
   var wordSize = word.length
   println (word + " has " +wordSize + " letters.")

  
}

//Character Escape Sequences
fun main() {

  // Add the correct escape sequences to the text below to achieve the output shown in the instructions 

  print("Dear Learner 👋, \n\n\tI hope you're enjoying the Learn Kotlin course. You've made tremendous progress. Keep going! And remember, Knowledge is power. (Frances Beacon).\n\n With love,\n Codey")
}


//Arithmetic Operators

fun main() {

  // Appetizer 
  val caesarSalad = 8.50

  //  Entree 
  val beefStroganoff = 18

  // Dessert 
  val cheesecake = 6

  // Add your code below ⬇️
var total = caesarSalad + beefStroganoff + cheesecake
var tip = 0.15
var finalAmount = total*tip + total
println(finalAmount)

}
//Order of Operations
fun main() {
  var answer1 = 7 - 5 + 4 * 3 
  var answer2 = (9 - 3) / 2 
  var answer3 = (6 + 8) + (4 - 7) 

  println(answer1)
  println(answer2)
  println(answer3)
}

//Augmented Assignment Operators
fun main() {
  var speedOfLight = 186_000
  // Write your code here 
 speedOfLight += 282
  var perfectSquare = 32
  // Write your code here 
perfectSquare *= 2
  var sheldonsFavoriteNum = 219
  // Write your code here 
sheldonsFavoriteNum /= 3
  var emergency = 920 
  // Write your code here 
emergency -= 9
  var firstCountingNum = 10 
  // Write your code here 
firstCountingNum %= 5

  println("The speed of light is ${speedOfLight}.")
  println("A perfect square is ${perfectSquare}.")
  println("Sheldon's favorite number is ${sheldonsFavoriteNum}.")
  println("The emergency number in the United States is ${emergency}.")
  println("The first counting number in programming is ${firstCountingNum}.")

}

//Increment and Decrement Operators

fun main() {

  var a = 5 
  a += 6
println(a)
//a: 11
  var b = a * 9 
  var c = b / 3 
  c++ 
  println(c)
  //c: 34
  var d = c + 8 
  d %= 4
  d--
println(d)
// d: 1
}


//The Math Library
fun main() {

  var ceil = Math.ceil(3.5)
  println(ceil)
  // Add your notes below
  
  var sqrt = Math.sqrt(25.0) 
  println(sqrt)
  // Add your notes below

  var abs = Math.abs(-20) 
  println(abs)
  // Add your notes below 

  var floor = Math.floor(6.9)
  println(floor)
  // Add your notes below 

}




