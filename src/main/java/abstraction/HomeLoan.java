package abstraction;
//
//public class HomeLoan extends loanMaster{
//
//    public HomeLoan(String loanNumber, Double loanAmount, Double interestRate, Integer tenureInMonth) {
//        super(loanNumber, loanAmount, interestRate, tenureInMonth);
//    }
//
//    @Override
//    Double calculateInterest() {
//        return this.loanAmount*this.interestRate*(1/12);
//    }
//
//    @Override
//    Double processPrincipal(int installmentNumber) {
//        if(installmentNumber>24){
//            return this.loanAmount/(tenureInMonth-24);
//        }
//        return 0.0;
//    }
//
//    @Override
//    Double processCharges(boolean latePayment) {
//        if(latePayment){
//            return 5000.0;
//        }
//        return 0.0;
//    }
//}




