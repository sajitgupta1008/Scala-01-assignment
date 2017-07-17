import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class FibonacciTillNTest extends FunSuite {

  test("testing fibonacci till n"){
    assert(new FibonacciTillN().fibo(7)==List(0, 1, 1, 2, 3, 5, 8))
  }
}
