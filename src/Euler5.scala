object Euler5 extends App {    
    def divideByPrime(prime:Int, lst:List[Int], primeFactors:List[Int]):(Int, List[Int], List[Int]) = {      
      (lst.find(_ % prime == 0)) match {
        case Some(list) => divideByPrime(prime, lst.map(x => if(x%prime ==0) x/prime else x).filter(_ != 1), prime::primeFactors)
        case _ => (prime, lst, primeFactors)
      }
    }
    val numbers = 2 to 20 toList
    val primes = List(2, 3, 5, 7, 11, 13, 17, 19)    
    val result = primes.foldLeft((1, numbers, List(1)))((lst, i) => divideByPrime(i, lst._2, lst._3) )
    val lcd = (result._3).foldLeft(1)(_*_)    
    println("result " + lcd)  
}