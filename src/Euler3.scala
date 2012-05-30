object Euler3 extends App {
  val num = 600851475143L
  val sqrtOfNum = math.sqrt(num).toLong
  
  def maxPrimeFactor(x: Long): Long = {
    ((2L to 3L) ++ (5L to math.sqrt(x).toLong by 2)).find(x % _ == 0) match {
      case Some(factor) => maxPrimeFactor(x/factor)
      case _ => x
    }
  }
  println(maxPrimeFactor(num))
}