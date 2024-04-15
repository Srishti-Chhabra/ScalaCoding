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
    def loop(currentNumber: Int, primesFound: Int): Int = {
      if (primesFound == n) currentNumber - 1
      else if (isPrime(currentNumber)) loop(currentNumber + 1, primesFound + 1)
      else loop(currentNumber + 1, primesFound)
    }
    loop(2, 0)
  }
}

object NthPrimeNumber extends App {
  val prime = new Prime
  print(prime.nthPrimeNumber(4))
}
