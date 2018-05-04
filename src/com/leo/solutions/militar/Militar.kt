package com.leo.solutions.militar

fun main(args: Array<String>) {
    val hour = "01:54:34AM"
    convertTimeToMilitarTime(hour)
}


fun convertTimeToMilitarTime(timeString:String) {
    val time = Time(timeString.substringBefore(":"), timeString.substring(timeString.length-2, (timeString.length)), timeString.substring(0,8))
    val hour:String = when(time.timeType) {
        "PM"-> {
            if(time.hour.equals("12")){
                time.time.replaceBefore(":","12")
            }else {
                time.time.replaceBefore(":",(time.hour.toInt()+12).toString())
            }

        }
        "AM" -> {
            if(time.hour.equals("12"))
                time.time.replaceBefore(":","00")
            else {
                time.time.replaceBefore(":",time.hour)
            }
        }
        else -> time.time
    }

    print(hour)
}

data class Time(var hour:String = "", var timeType:String= "PM", var time:String = "")