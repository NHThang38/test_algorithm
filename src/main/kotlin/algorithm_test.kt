
fun miniMaxSum(arr: Array<Int>): Unit{
    var min = Int.MAX_VALUE;
    var max = 0;
    var sum = 0L;

    for(number in arr) {
        sum += number;
        if(number < min) min = number;
        if(number > max) max = number;
    }
    println("${sum - max} ${sum - min}");
}
fun main() {
    println(Int.MAX_VALUE);
    println("Nhập vào 5 số nguyên ngăn cách bởi một khoảng trắng: ")
    var arrayInt:Array<Int> = readLine()!!.split(" ").map {it.toInt()}.toTypedArray();
    miniMaxSum(arrayInt);

}