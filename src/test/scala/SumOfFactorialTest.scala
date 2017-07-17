import org.scalatest.FunSuite

/**
  * Created by knoldus on 16/7/17.
  */
class SumOfFactorialTest extends FunSuite {
  test("testing sum of factorial by recursion"){
    assert(new SumOfFactorial().computeSum(5)==3)
  }

}
