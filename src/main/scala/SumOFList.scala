/**
  * Created by knoldus on 16/7/17.
  */
class SumOFList {


  def sum(list : List[Int]):Int = {

    def comp(list:List[Int], sum:Int):Int={
      if(list.isEmpty)
        sum
      else
        comp(list.tail, sum + list.head)
    }
    comp(list,0)
  }

}
