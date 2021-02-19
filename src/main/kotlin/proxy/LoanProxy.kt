package proxy

class LoanProxy : Loan {

    // compile ensure
    private val bankLoan: Loan = BankLoan()
    private val orgLoan: Loan = OrgLoan()

    override fun loan(money: Long) {
        println("贷款代理贷款 $money")
        val some = money / 2
        bankLoan.loan(some)
        orgLoan.loan(money - some)
    }
}