import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter a: ")
    var fnumber=reader.nextDouble()

    println("Enter b: ")
    var snumber =reader.nextDouble()

    println("Enter height: ")
    var tnumber=reader.nextDouble()

    var sum=fnumber+snumber
    var hapo=0.5
    var product= hapo*sum*tnumber
    println("The product of the numbers is $product")
}