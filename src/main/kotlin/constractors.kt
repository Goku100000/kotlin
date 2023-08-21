class Dog(var breed:String, var color:String){

}
fun main(){
    var c=Dog("Chiwawa","black")
    println(c.breed)
    println(c.color)

    var d=Dog("Siberian Husky","brown")
    println(d.color)
    println(d.breed)
}