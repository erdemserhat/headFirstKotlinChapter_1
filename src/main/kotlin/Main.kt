import java.util.*

fun main(args: Array<String>) {
    //Printing a String line ;
    println("WELCOME TO MY FIRST KOTLIN PROJECT")

    //Creating string values.
    val name="Serhat"
    val name2:String="Ali"
    //Creating integer values
    val age=22
    val age2:Int=23;

    //Effective concatenation.
    println("my name is $name and my friend's name is $name2, I am $age years old and he is $age2 years old.")

    //Note : If you claim your data as "val" this represents as value so, it cannot be changed next times.
    //But if you claim your data as "var" this represents as variable so, it can be changed next times because it is a variable.
    println()
    println()

    var x =10
    x+=10
    println(x)

    x=37;
    println(x)
    var y=x
    println(y+x)

    x=0;
    while (x<20){
        var y=x+1;
        println("$y times worked")
        x++

    }


    //Logical
    for(i in 1..100){
        x++
    }
    println(x)

    compareNumbers(0,0)

    var l =0;
    do {
        l++
        println("do loop")
    }while (false)

    x=10
    y=12



    println(if (y>x) "y is greater than x" else "x is greater than y")
    basicGame()
}




fun compareNumbers(number1:Int, number2:Int){
    if(number1>number2){
        println("$number1 is greater than $number2")
    }else if(number2>number1){
        println("$number2 is greater than $number1")
    }else{
        println("$number1 equals $number2")
    }





}

fun basicGame(){
    var x =1
    while(x<3){
        print(if(x==1) "Yab" else "Dab")
        print("ba")
        x++
    }
    if(x==3) print("Do")


}