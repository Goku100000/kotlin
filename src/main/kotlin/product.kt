import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter first number: ")
    var fnumber=reader.nextInt()

    println("Enter second number: ")
    var snumber =reader.nextInt()

    var product= fnumber*snumber
    println("The product of the numbers is $product")
}