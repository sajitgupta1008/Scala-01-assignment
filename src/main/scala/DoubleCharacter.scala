/**
  * Created by knoldus on 16/7/17.
  */
class DoubleCharacter {

  def compute(text: String): String = {

    def compute2(t: String, index: Int, outString: String): String = {

      if (index >= t.length - 1)
        outString
      else {
        if (t(index) == t(index + 1)) {
          val s = t(index) + "" + t(index)
          compute2(t, index + 2, outString + s)
        } else
          compute2(t, index + 1, outString)
      }

    }

    compute2(text, 0, "")

  }
}
