/**
  * Created by knoldus on 17/7/17.
  */
class Sumof2Lists {
  def findSum(l1:List[Int], l2:List[Int]):List[Int] = {


    def compute(l1:List[Int],l2:List[Int], out:List[Int]):List[Int] = {
      if(l1.isEmpty || l2.isEmpty)
        out
      else
        compute(l1.tail,l2.tail, (l1.head+l2.head)::out)
    }

    compute(l1,l2,List[Int]()).reverse
  }

}
