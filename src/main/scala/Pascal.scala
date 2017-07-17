/**
  * Created by knoldus on 17/7/17.
  */
class Pascal {

  def  findPascal(c:Int, r:Int):Int = {


    def compute2(col:Int, row:Int,value1:Int, value2:Int ):Int={
      if(col==0)
        value1/value2
      else
        compute2(col-1,row-1, value1*row, col*value2 )
    }
    compute2(c,r,1,1)
  }
}
