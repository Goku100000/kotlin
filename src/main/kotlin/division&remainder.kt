import java.util.Scanner
fun main(){
    var calc=Scanner(System.`in`)

    println("Enter first number: ")
    var fnumber=calc.nextInt()

    println("Enter second number: ")
    var snumber=calc.nextInt()

    var quotient=fnumber/snumber
    var modular=fnumber%snumber
    println(" the quotient is $quotient. the modular is $modular")
}