fun main(){
    var top="Hello world"
    var school="eMobilis"
    var day="It's a Saturday"

    println(top+" "+school) //Concatenation
    println(top.plus(school))
    println(top+" I study at "+school)
    println("I study at $school") //String interpolation
    println(day)
    println(top[0]) //Accessing an element
    println(top[10])
    println(top.indexOf('H'))
    println(top.indexOf("world"))

    println(top.toUpperCase())

}