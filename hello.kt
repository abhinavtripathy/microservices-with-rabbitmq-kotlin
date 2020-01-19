fun main() {
    println(arr())
}

fun loop() {

    for(i in 1..3) {

        println("hello world")

    }

    return "done"

}

fun arr(): int {

    val arr = IntArray(5);

    for(i in arr.indices) {

        arr[i] = i;

    }

    return arr

}