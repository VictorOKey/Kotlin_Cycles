/*fun main() //Рисование числами
{
    for(i in 1..5){
        for (j in 1..i){
            print(i)}
        println()}
}*/
/*
fun main() //Простая игра
{
    val num1 = 4
    var num2 = readln().toInt()
    while (num1 != num2)
    {
        println("Неверно, повторите попытку:")
        num2 = readln().toInt()
    }
    if (num1 == num2)
    {
        println("Вы угадали число!ʕᵔᴥᵔʔ")
    }
}*/
/*
fun main() // Делители числа
{
    val num = readln().toInt()
    for (i in 1..num)
    {
        if (num % i == 0)
            print("${i} ")
    }
}*/
/*
fun main() //четные или нечетные цифры в числе
{
    var num = readln().toInt()
    var odd = 0
    var even = 0
    while (num > 0)
    {
        if(num % 2 == 0){
            even+=1
        }
        else {odd +=1}
        num /=10
    }
    println("Нечётных: ${odd}")
    println("Чётных ${even}")
}
*/
/*
fun main() //сумма чисел от 1 до 100 кратные 4
{
    var num = 0
    for(i in 1..100)
    {
        if(i % 4 == 0)
        {
            num += i
        }
    }
    println("Сумма чисел = ${num}")
}*/
/*
fun main() //нахождение суммы от 5 до 57 без 34, 46, 52
{
    var num1 = 5
    var num2 = 5
    while(num1 !=57)
    {
        num1 +=1
        if(num1 != 34 && num1 != 46 && num1 != 52)
        {
            num2 += num1
        }
    }
    println("Сумма чисел = ${num2}")
}*/
