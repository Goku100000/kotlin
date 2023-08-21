class Person(){
    //Attribute/Property/Variable
    var name="Glory"
    var skintone="lightskin"
    var age=45
    //Method/Function
    fun eat(){
        println("Eating")
    }
    fun walk(){
        println("Walking")
    }
}

fun main(){
    //object1
    var teacher=Person()
    println( teacher.age)

    teacher.walk()

    //object2
    var accountant=Person()
    println(accountant.name)
    accountant.eat()
}
