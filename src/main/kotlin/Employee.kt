class Employee(var jobdesciption:String,var salary:Double,var yearsOfExperience:Int,var age:Int){

}
fun main(){
    var a=Employee("Manager",25000.00,48,30)
    println(a.jobdesciption)

    var b=Employee("Secretary",450000.00,14,39)
    println(b.jobdesciption)

}