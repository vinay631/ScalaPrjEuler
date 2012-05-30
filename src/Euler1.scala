object Euler1 extends App {
  val sum =  (1 until 1000).view.filter(num => num % 3 == 0 || num % 5 == 0).sum
  println(sum)
  assert(sum == 233168)
}