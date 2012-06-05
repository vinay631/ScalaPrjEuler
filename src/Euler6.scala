object Euler6 extends App {
  val n = 100
  val sumOfN = n * (n + 1)/2
  val sumOfNSquare = n * (n + 1) * (2 * n + 1) / 6
  val result = (sumOfN * sumOfN) - sumOfNSquare
  println(result) //25164150
}