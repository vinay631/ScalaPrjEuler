object Euler10 extends App {
  lazy val primes: Stream[Int] = 2 #:: Stream.from(3).filter(i =>
  	primes.takeWhile(j => j * j <= i).forall(i % _ > 0))
  
  val sum = primes.view.takeWhile(_ < 2000000).foldLeft(0L)(_ + _)
  println(sum)
}