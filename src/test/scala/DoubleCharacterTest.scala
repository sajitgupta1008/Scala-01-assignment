import org.scalatest.FunSuite

/**
  * Created by knoldus on 16/7/17.
  */
class DoubleCharacterTest extends FunSuite {

  test("testing sum of list by recursion"){
    assert(new DoubleCharacter().compute("abcaabccd")=="aacc")
  }

}
