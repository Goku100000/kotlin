//Parent class
open class Shape{
    fun area(){
        println("3500cm2")
    }
    fun circumference(){
        println("450cm")
    }
}
class Rectangle:Shape(){
    var length=500
    var breadth=300
    fun getlength(){
        println(length)
    }
    fun getbreadth(){
        println(breadth)
    }
}
class Circle:Shape(){
    fun radius(){
        println(15)
    }
    fun getradius(){
        println(40)
    }
}
fun main(){
    var g=Rectangle()
    g.getlength()
    var h=Circle()
    h.radius()
}