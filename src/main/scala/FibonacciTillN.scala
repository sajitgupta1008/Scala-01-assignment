/**
  * Created by knoldus on 17/7/17.
  */
class FibonacciTillN {

  def fibo(limit: Int): List[Int] = {

    def compute(a: Int, b: Int, out: List[Int], l: Int): List[Int] = {
      val c = a + b
      if (limit == 1)
        List(0)
      else if (l > limit)
        out
      else
        compute(b, c, c::out, l + 1)

    }
    compute(0, 1, List(1,0), 3).reverse


  }
}
