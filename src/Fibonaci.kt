fun main(args: Array<String>) {
    val x = Array(5,{i->i})
    for (i in 0..x.size){
        println(fibonaci(i))
    }
}
fun fibonaci(a: Int ): Int{
    if (a==0 || a==1)return a
    else return fibonaci(a-1)+fibonaci(a-2)
}
//class InitOrderDemo(name: String){
//    val firstProperty = "First property: $name".also(::println)
//
//    init {
//        println("First initializer block that prints ${name}")
//    }
//    val secondProperty = "Second property: ${name.length}".also(::println)
//    init {
//        print("Second initialized block that print ${name}")
//    }
//}
