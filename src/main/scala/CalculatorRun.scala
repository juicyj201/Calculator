import scala.io.StdIn.readLine
import scala.sys.exit
import scala.util.control.Breaks.{break, breakable}

object CalculatorRun {
  val calc = new Calculator
  var res = ""
  var res1 = ""
  var res2 = ""
  var end: Boolean = false

  def main(args: Array[String]): Unit = {
    while (true && res.equals("") && end == false) {
      console1()

      if(!res.equals("")) {
        consoleN(res)
        res = ""
      }
    }
  }

  def console1(): Unit ={
    //console start
    println("Welcome\t\t(press end to stop the program)")
    println("--------------------")
    println("Press a number for the type of calculation you want to do:\n")
    println("1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division\n")
    res = readLine

    if(res.equalsIgnoreCase("end")) {
      end = true
      exit(0)
    }
  }

  def consoleN(result: String): Unit ={
    println("--------------------")
    println("Enter two numbers that you would like to perform an operation on:\n")
    res1 = readLine
    res2 = readLine

    println("\nThe answer to that is: ")

    val int1 = res1.toInt
    val int2 = res2.toInt

    if(result.equalsIgnoreCase("end")) {
      end = true
      exit(0)
    } else if(result.equals("1")) {
      calc.addition(int1, int2)
      println
    } else if(result.equals("2")) {
      calc.subtract(int1, int2)
      println
    } else if(result.equals("3")) {
      calc.multiply(int1, int2)
      println
    } else if(result.equals("4")) {
      calc.divide(int1, int2)
      println
    }
  }
}
