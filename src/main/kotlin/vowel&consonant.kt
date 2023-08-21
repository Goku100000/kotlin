import java.util.Scanner
fun main(){
    var letter=Scanner(System.`in`)

    println("Enter alphabet: ")
    var alphabet=letter.next().single()
    if (alphabet=='a'|| alphabet=='e'|| alphabet=='i'|| alphabet=='o'|| alphabet=='u'){
        println("it is a vowel")
    }
    else{
        println("it is a consonant")
    }
}