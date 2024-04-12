class Prime{
  def isPrime(n: Int): Boolean = {
    def loop(i: Int): Boolean = {
      if (i > Math.sqrt(n).toInt)
        return true
      if (n % i == 0)
        return false
      loop(i + 1)
    }
    loop(2)
  }

  def nthPrimeNumber(n: Int): Int = {
    var count = 1
    var i = 2
    while(count<=n){
      if(isPrime(i))
          count = count + 1
      i = i + 1
    }
    i-1
  }
}

object NthPrimeNumber extends App {
  val prime = new Prime
  print(prime.nthPrimeNumber(4))
}
