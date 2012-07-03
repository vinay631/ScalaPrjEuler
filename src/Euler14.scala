object Euler14 extends App {

  def chain(num:Long):Int = {
    if(num == 1)
      1
    else
      1 + chain(if(num%2 == 0) num/2 else 3*num + 1) 
  }
  
  val start = System.currentTimeMillis

  val result = (1 until 1000000).view.map(n => (n, chain(n))) maxBy (_._2)
  
  println(result._1)
  println(System.currentTimeMillis - start)

  //TODO: Memoization of resulkts?

}