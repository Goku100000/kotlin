import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter temperature: ")
    var temperature=reader.nextInt()

    if (temperature>37){
        println("it is too hot")
    }
    else{
        println("it is too cold")
    }
}