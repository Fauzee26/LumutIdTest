package fauzi.hilmy.lumutidtest.util

import fauzi.hilmy.lumutidtest.R

internal object Commons {
    const val BASE_URL = "https://jsonplaceholder.typicode.com/todos/"

    fun getTopicColor(input: String): Int {
        when (input) {
            "A" -> {
                return R.color.red300
            }
            "B" -> {
                return R.color.blue300
            }
            "C" -> {
                return R.color.green300
            }
            "D" -> {
                return R.color.yellow300
            }
            "E" -> {
                return R.color.brown300
            }
            "F" -> {
                return R.color.teal300
            }
            "G" -> {
                return R.color.orange300
            }
            "H" -> {
                return R.color.pink300
            }
            "I" -> {
                return R.color.purple300
            }
            "J" -> {
                return R.color.lightGreen300
            }
            "K" -> {
                return R.color.lightBlue300
            }
            "L" -> {
                return R.color.lime300
            }
            "M" -> {
                return R.color.indigo300
            }
            "N" -> {
                return R.color.deepPurple300
            }
            "O" -> {
                return R.color.cyan300
            }
            "P" -> {
                return R.color.amber300
            }
            "Q" -> {
                return R.color.blueGrey500
            }
            "R" -> {
                return R.color.indigo500
            }
            "S" -> {
                return R.color.green500
            }
            "T" -> {
                return R.color.lightBlue500
            }
            "U" -> {
                return R.color.yellow500
            }
            "V" -> {
                return R.color.grey700
            }
            "W" -> {
                return R.color.amber600
            }
            "X" -> {
                return R.color.indigo500
            }
            "Y" -> {
                return R.color.pink500
            }
            else -> {
                return R.color.purple500
            }
        }
    }
}
