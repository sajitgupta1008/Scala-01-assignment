import org.scalatest.FunSuite

/**
  * Created by knoldus on 16/7/17.
  */
class FibonacciTest extends FunSuite {
  test("testing fibonnaci by recursion"){
    assert(new Fibonacci().fib(6)==8)
  }
}
