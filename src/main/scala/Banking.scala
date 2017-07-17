/**
  * Created by knoldus on 17/7/17.
  */

  class Account(val id: Int, val name: String, val balance: Double) {

    require(id > 0 && !name.isEmpty && balance >= 0)


    def this(id: Int, name: String) = this(id, name, 0)

    override def toString(): String = s"Id = $id, name =  $name, balance =  $balance"

    def +(bal: Int): Account = {
      //credit
      new Account(id,name,balance+bal)
    }



    def -(bal: Int): Account = {
      //debit

      if (bal <= balance) {
        new Account(id,name,balance-bal)
      }
      else
        throw new Exception("cannot debit more than the balance")
    }

  }


