//import scala.swing._

class Calculator {
  private var first: Int = 0
  private var second: Int = 0
  private var answer: Int = 0
  private var floatAnswer: Float = 0
  private var doubleAnswer: Double = 0;
  private val zero: Int = 0


  // 1. Add a definition for multiplication and division as a check.
  // 2. Add a new system for converting from integer to decimal.
  // 3. Add a new menu system (for example a system.in) for the use of the calculator (such as in java).
  // 4.

  def checkFloat(answer: Int): Boolean ={
    if((answer%1) == 0){
      return false
    }
    else{
      return true
    }
  }

  def checkInt(answer: Int): Boolean ={
    if((answer%1) == 0){
      return true
    }
    else{
      return false
    }
  }

  def showAns(answer: Int){
    println(answer)
  }

  def showFloat(answer: Float){
    println(answer)
  }

  //The seperate conversion systems.

  def ConversionToDec(conOne: Int): Unit = {
    println("This will convert an integer answer to decimal point.");
    println("The first value you put in must be an integer that you wish to convert.");

    answer = conOne;
    var ans = answer.toDouble

    println("The conversion: " + ans);
  }

  def ConversionToInt(conOne: Double): Unit = {
    println("This will convert a decimal answer to integer/whole number value.");
    println("The first value you enter must be a decimal value that you wish to convert.");

    doubleAnswer = conOne;
    answer = doubleAnswer.toInt;

    println("The conversion: "+ answer);
  }

  //create procedures rather than returnable methods, that way i can format the answer, my way

  //add method - add a first and second value
  def addition(first: Int, second: Int){
    if(first != -first & second != -second) {
      answer = first + second

      //NB - put in implementation for decimal place if needed
      showAns(answer)
    }
    else {
      answer = 0
      showAns(answer)
    }
  }

  //subtract method - subtract a second from a first value
  def subtract(first: Int, second: Int){
    if(first != -first & second != -second) {
      answer = first - second

      //NB - put in implementation for decimal place if needed
      showAns(answer)
    }
    else {
      answer = 0
      showAns(answer)
    }
  }

  //multiply method - multiply two value together
  def multiply(first: Int, second: Int){
    if(first != zero | second != zero) {
      answer = first * second
      if(checkInt(answer) == true) {
        showFloat(answer)
      }
      else {

        //NB - put in implementation for decimal place if needed
        floatAnswer = answer.toFloat
        showFloat(floatAnswer)
      }
    }

    else {
      print("Answer is zero, since you multiplied with zero")
    }
  }

  //divide method - divide the first method by the second
  def divide(first: Int, second: Int){
    if(first == zero) {
      print("Answer is zero, since you divided by zero")
    }

    if(second == zero) {
      print("Cannot divide by zero, peasant")
    }

    if(first != zero & second != zero) {
      answer = first/second

      if(checkInt(answer) == true) {
        showAns(answer)
      }else{

        //NB - put in implementation for decimal place if needed
        floatAnswer = answer.toFloat
        showFloat(floatAnswer)
      }
    }

    else {
      print("Error")
    }
  }
}

object Calculator{
  def main(args: Array[String]): Unit = {
    var obj = new Calculator
    obj.divide(2, 8)
  }
}