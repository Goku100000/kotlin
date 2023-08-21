open class Employee1{
    fun name(){
        println("Kenneth")
    }
    fun age(){
        println(45)
    }
    fun salary(){
        println(45000)
    }
}
class webDeveloper:Employee1(){
    fun website(){
        println("Ecomerce")
    }
}

class androiddeveloper:Employee1(){
    fun android(){
        println("My first app")
    }
}
class iOSDeveloper:Employee1(){
    fun iOS(){
        println("Just print")
    }
}
fun main(){
    var w=webDeveloper()
    w.salary()
    var a=androiddeveloper()
    a.salary()
    var i=iOSDeveloper()
    i.name()
}