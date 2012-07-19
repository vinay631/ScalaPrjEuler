//Can be solved as combinatorial problem of 2*n choose n
object Euler15 extends App {
  val n = 20
  val res = for (k <- (0 until n)) yield BigInt(2 * n - k)
  val div = for (k <- (1 to n)) yield BigInt(k)
  val result = res.product / div.product
  println(result)
}