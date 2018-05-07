package com.leo.solutions.grading

/*
* @author("Leo")
* Problem
* https://www.hackerrank.com/challenges/grading/problem
*/

fun main(args: Array<String>) {
    val grades = arrayListOf(73, 67, 38, 33)
    val newGrades = grades.asSequence().map { calculateGrade(it) }.toList()
    print(newGrades)
}

private fun calculateGrade(grade: Int): Int {
    val div = grade / 10
    val rem = grade % 10
    val comparedGrade = calculateCompareGrade(div, rem)
    val newGrade = calculateNextGrade(comparedGrade, grade)
    return newGrade
}

private fun calculateNextGrade(comparedGrade: Int, grade: Int): Int {
    return when {
        grade < 38 -> grade
        (comparedGrade - grade) < 3 -> comparedGrade
        (comparedGrade - grade) == 3 -> grade
        else -> grade
    }
}

private fun calculateCompareGrade(div: Int, rem: Int): Int {
    return when {
        rem <= 5 -> (div * 10) + 5
        rem >= 6 -> (div * 10) + 10
        else -> rem
    }
}