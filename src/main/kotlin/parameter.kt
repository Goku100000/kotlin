class Animal(var mycolor:String,var mysize:Int){
    var color="white"
    var size=34

    fun eat(){
        println("It is eating")
    }
    fun sleep(name:String){
        println("The animal is $name")
    }
    fun woof(){
        println("woofing")
    }
}
fun main(){
    var a=Animal("white",34)
    var f=Animal("Golden",4)

    f.sleep("fish")

    var l=Animal("white",30)
    l.sleep("leopard")
}