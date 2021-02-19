package proxy

class BankLoan : Loan {

    override fun loan(money: Long) {
        println("向银行贷款 $money")
    }
}