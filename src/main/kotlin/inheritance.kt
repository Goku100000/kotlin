//Parent class/Super class/Base class
open class Animalia{
    var color="Brown"

    fun eat(){
        println("Animal is eating")
    }
}
//Child class/Sub class/Derived class
class Dog1:Animalia(){
    var name="Siberian Husky"
    fun sound(){
        println("Dog is barking")
    }
}
class cat:Animalia(){
    var hasFur=true
    fun meow(){
        println("Meowing")
    }
}
fun main(){
    var a=Animalia()
    println(a.color)
    a.eat()

    var d=Dog1()
    d.eat()

    var c=cat()
    c.meow()
    println(c.hasFur)

}