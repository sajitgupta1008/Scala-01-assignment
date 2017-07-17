import org.scalatest.FunSuite

/**
  * Created by knoldus on 17/7/17.
  */
class PascalTest extends FunSuite {
  test("testing pascal triangle"){
    assert(new Pascal().findPascal(1,3)==3)
  }
}
