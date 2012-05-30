object Euler2 extends App {
  lazy val fib:Stream[Int] = 0 #:: 1 #:: fib.zip(fib.tail).map(p => p._1 + p._2)
  val res = fib.filter( _ % 2 == 0).takeWhile(_ <= 1000000).foldLeft(0)(_ + _ )
  println(res)
  assert(res == 1089154)
}