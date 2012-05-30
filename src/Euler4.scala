import Stream._
object Euler4 extends App {
  lazy val maxPalindrome = (999 to 100 by -1).view
  											 .flatMap(i => (i to 100 by -1)
  											 .map(j => i * j))
  											 .filter(num => num.toString == num.toString.reverse).max
  
  println(maxPalindrome)  										
}