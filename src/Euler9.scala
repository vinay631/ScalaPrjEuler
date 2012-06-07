object Euler9 extends App {
  //given a pair of arbitrary number i, j, pythagorean tiplet can be found using:
  //a = i*i - j*j,  b = 2 * i * j, c = i * i + j * j   
  //Pythagoran triplets can be scaled too. For example 3,4,5 scaled by 2, i.e. 6,4,10
  //So after "smaller" triplets we can scale them to see if they form the required solution
  def triplets(num:Int):(Int,Int,Int) = {
    for(i <- 1 until 30) {
      for(j <- 1 until 30) {
        val result = (i*i - j*j, 2*i*j, i*i+j*j)
        val sum = result._1 + result._2 + result._3
        if(result._1 >0 && num%sum == 0) {
          val scale = num/sum
          return (result._1 * scale, result._2 * scale, result._3 * scale)
        }        
      }      
    }
    (0, 0, 0)
  }
  
  println(triplets(1000))
}