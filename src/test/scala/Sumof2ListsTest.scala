import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class Sumof2ListsTest extends FunSuite {
  test("testing sum of 2 lists"){
    assert(new Sumof2Lists().findSum(List(1,2,3),List(4,5,6))==List(5, 7, 9))
  }
}
