package proxy

class OrgLoan : Loan {

    override fun loan(money: Long) {
        println("向机构贷款 $money")
    }
}