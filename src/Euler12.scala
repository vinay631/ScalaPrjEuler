object Euler12 extends App {
    
  def countFactors(n:Int):Int = {    
    def factors2(nm:Int, count:Int, div:Int):(Int, Int) = {
      if(nm%div != 0)
        (nm, count)
       else
         factors2(nm/div, count + 1, div)
    }
    
    val fact = if(n%2 == 0) factors2(n/2, 0, 2) else factors2(n, 0, 2)     
    def factN(nm:Int, numFac:Int, div:Int):(Int, Int, Int) = {
      val fact = factors2(nm, 0, div)
      
      if(fact._1 == 1)  {
        (fact._1, numFac * (fact._2 + 1), div + 2)
      }
      else
        factN(fact._1, numFac * (fact._2 + 1), div + 2)
    }    
    val result = factN(fact._1, (fact._2 + 1), 3)       
    result._2
  }
  
  def findNum(numFactors:Int):Int = {    
    def factorCount(numF1:Int, numF2:Int, index:Int):(Int, Int, Int) = {
      if(numF1 * numF2 >= numFactors) 
        (numF1, numF2, index)
      else
        factorCount(numF2, countFactors(index + 2), index + 1)      
    }
    
    val result = factorCount(countFactors(1), countFactors(2), 1)
    result._3
  }    
  
  val triangleNum = findNum(500)  
  println((triangleNum + 1) * triangleNum/2)  
}