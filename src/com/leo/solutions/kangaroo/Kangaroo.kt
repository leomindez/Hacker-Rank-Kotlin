package com.leo.solutions.kangaroo

/**
 * Problem
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */

fun main(args: Array<String>) {
    val location = sameLocation(0,2,5,3)
    print(location)
}

private fun sameLocation(x1:Int,v1:Int,x2:Int,v2:Int):String {
    return when {
        v1 > v2 && ((x2-x1)%(v1-v2)) == 0 ->
                "YES"
        else -> "NO"
    }
}