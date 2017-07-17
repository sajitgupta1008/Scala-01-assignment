import org.scalatest.FunSuite

/**
  * Created by knoldus on 16/7/17.
  */
class SumOFListTest extends FunSuite {

  test("testing sum of list by recursion"){
    assert(new SumOFList().sum(List(1,2,3))==6)
  }

}
