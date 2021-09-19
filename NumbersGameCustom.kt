import kotlin.random.Random

fun main(){
    val ran = Random.nextInt(11)
    println("THIS IS THE SECOND TRAIL!! WHERE ONLY THE SMART ONES LIVE1")
    println("IF YOU LOSE, YOU'RE DEAD!!")
    println("YOU WILL CHOOSE 2 NUMBERS AND FIGURE OUT THE HIDDEN NUMBER")
    println("TIP: you will choose 2 numbers, if you choose anything else it will be considered as zero.")
    println("you will see an equation made from your numbers and a hidden number X.")
    println("you have to find out what is X to win. good luck!")

    var num1:Int = 0
    var num2:Int = 0
    try {
        println("What is the 1st number you chose?")
        num1 = readLine()!!.toInt()
    }
    catch (e:Exception){
        println("I SAID NUMBER, LOSER! I WILL TAKE THAT AS ZERO.")
    }
    try{
        println("What is the 2nd number you chose?")
        num2 = readLine()!!.toInt()
    }
    catch (e:Exception){
        println("I SAID NUMBER, LOSER! I WILL TAKE THAT AS ZERO.")
    }

    val sum = num1 + num2 + ran
    println("$num1 + $num2 + X = $sum")
    try{
        println("NOW, WHAT IS X?")
    val guess = readLine()!!.toInt()
        if (num1 + num2 + guess == sum)
            println("HMMPH! NOT BAD, HUMAN!")
        else
            println("HAHAHA! WHAT A LOSER!!")
    }
    catch (e:Exception){
        println("YOU LOST!! ")
    }
}
