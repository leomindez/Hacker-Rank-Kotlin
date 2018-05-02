package com.leo.solutions.cake

/**
 * Created by leo on 01/05/18.
 */

/**
We have one candle of height , one candle of height , and two candles of height .
Your niece only blows out the tallest candles, meaning the candles where .
Because there are  such candles, we print  on a new line.
https://www.hackerrank.com/challenges/birthday-cake-candles/problem
**/

fun main(args: Array<String>) {
    val candles = arrayListOf<Int>(3,1,2,3,3,4,52,3,4,5,7,8,9,0,7,65,45,6,7,8,9,0,8,75,443,3,2,1,2,3,4,5,67,4)
    blowOutCake(candles = candles)
}


private fun blowOutCake(candles:ArrayList<Int>) {
    val frequency = mutableMapOf<Int,Int>(candles[0] to 1)
    candles.subList(1,candles.size).forEach {
        if(frequency.containsKey(it)) {
            val counter = frequency.get(it)
            frequency.replace(it,counter!!.plus(1))
        }else {
            frequency.put(it,1)
        }
    }

    val max = frequency
            .asSequence()
            .maxBy { it.value }

    print(max?.value)
}