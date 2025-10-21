package com.dam

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val i = 20
    val b = 10

    /*
    println("VALORES 20 y 10")
    println("Suma: " + (i + b))
    println("Division: " + i/b)
    println("Resta:" + (i-b))
    println("Resto: " + i%b)
    println("Multiplicacion: " + i*b)*/

    //actividad2()
    //actividad3()
    //actividad4()
    //actividad5()
    /*if(actividad6(5))
    {
        println("Es primo")
    }
    else
    {
        println("No es primo")
    }*/
    //actividad7()
    //actividad8()

    //actividad9()
    actividad10()
}

fun actividad2()
{
    println("Escribe un numero: ")
    var num = readln().toInt()

    if (num % 2 == 0)
    {
        println("Par")
    }
    else
    {
        println("Impar")
    }
}

fun actividad3()
{
    println("Escribe un numero de la semana: ")
    val num = readln().toInt()

    when(num){
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6,7 -> println("Fin de semana")
        else -> println("Valor no valido")
    }
}

fun actividad4()
{
    println("Escribe un numero a multiplicar: ")
    val num = readln().toInt()

    for(i in 0..10)
    {
        println(num * i)
    }
}

fun actividad5()
{
    println("Escribe una cadena de texto: ")
    val text = readln()

    for(i in 0 until text.count())
    {
        print(text.get(i) + " ")
    }

    println()

    for(j in text.count() - 1 downTo  0)
    {
        print(text.get(j) + " ")
    }
}

fun actividad6(num: Int): Boolean
{
    var cont: Int = 0
    for(i in 1 ..num)
    {
        if(num % i == 0)
        {
            cont++
        }
    }

    return cont < 2
}

fun actividad7()
{
    println("Elige un dia de la semana (1-7):")
    val dia : Int = readln().toInt()

    val semana = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    if(dia < 0 || dia > 7) {
        println("Numero incorrecto, los dias de la semana son 7.")
        for((posicion, valor) in semana.withIndex())
        {
            println("${posicion + 1} = $valor")
        }
    }
    else{
        println(semana[dia - 1])
    }
}

fun actividad8()
{
    val listaTextos: MutableList<String> = mutableListOf()

    println("Escribe textos:")
    do {
        val texto : String = readln()
        if(texto != "fin") {
            listaTextos.add(texto)
        }
    }
    while (texto != "fin")

    val listaReversa = listaTextos.reversed()

    println("Al reves:")
    for(l in listaReversa)
    {
        println(l)
    }

    println("-------------\n Correcto:")
    for(l in listaTextos)
    {
        println(l)
    }
}

fun actividad9()
{
    val c1 = Coche("Mercedes", "C3", 2009)
    val c2 = Coche("Audi", "G200", 2013)
}

fun actividad10()
{
    val l = Libro("Stephen King", "It", 1986)

    println(l)
}