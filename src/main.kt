//Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun main(){
oddNumbers()
    println(namesArray(arrayOf("Lucy","MichaelJordain","Rosemary","MaryAnne")))
    robot(2)
    robot(10)
    robot(23)
    numbers()
}
fun oddNumbers() {
    for (n in 1..100) {
        if (n%2!==0){
            println(n)

        }
    }
}
fun namesArray(name: Array<String>):Int{
    var y =0
    name.forEach { k->
        if (k.length>5)
            y++
    }
    return  y
}
fun robot(age:Int){
    if ( age<=6){
        println("milk")
    }else if(age in 7..14){
        println("Fanta orange ")
    }else{
        println("coca cola")
    }
}
fun numbers(){
    for (num in 1..100){
        if (num%3==0){
            println("Fizz")
        }else if(num%5==0){
            println("Buzz")
        }else if( num%3==0 && num%5==0){
            println("FizzBuzz")
        }else{
            println(num)
        }
    }
}