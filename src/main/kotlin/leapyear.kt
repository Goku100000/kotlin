import java.util.Scanner
fun main(){
    var money=Scanner(System.`in`)

    println("Enter year: ")
    var year=money.nextInt()
     if (year%4==0){
         println("Year is leap")
     }
    else{
        println("Year is not leap")
    }

}