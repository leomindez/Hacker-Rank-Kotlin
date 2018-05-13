package com.leo.solutions.fruits

/**
 * Problem
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 */

fun main(args: Array<String>) {
    counterFruits(7, 11, 5, 15, 3, 2, arrayListOf(-2, 2, 1, 5, -6))
}

private fun counterFruits(s: Int, t: Int, a: Int, b: Int, m: Int, n: Int, fruits: ArrayList<Int>) {

    val frequency = mutableMapOf<String, Int?>("apples" to 0, "oranges" to 0)

    fruits.forEachIndexed({ index, element ->
        when {
            index + 1 <= m ->
                if (a + element in s..t) {
                    val counter = frequency.get("apples")?.plus(1)
                    frequency.replace("apples", counter)
                }
            index + 1 >= n ->
                if (b + element in s..t) {
                    val counter = frequency.get("oranges")?.plus(1)
                    frequency.replace("oranges", counter)
                }
        }
    })

    println(frequency.get("apples"))
    println(frequency.get("oranges"))
}