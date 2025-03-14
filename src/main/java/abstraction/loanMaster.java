package abstraction;

import java.time.LocalDate;

public abstract class loanMaster {
    protected final String loanNumber;
    protected final Double loanAmount;
    protected final Double interestRate;
    protected final Integer tenureInMonth;

    public loanMaster(String loanNumber,Double loanAmount, Double interestRate, Integer tenureInMonth){
        this.loanNumber = loanNumber;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.tenureInMonth = tenureInMonth;

    }
    public Double processEMI(int installmentNumber, LocalDate dueDate){
        LocalDate currentDate = LocalDate.now();
        Double principalAmount = processPrincipal(installmentNumber);
        Double chargeAmount = processCharges(dueDate.isBefore(currentDate));
        Double interestAmount = calculateInterest();
        Double emiAmount = principalAmount+chargeAmount+interestAmount;
        return emiAmount;
    }
    abstract Double calculateInterest();
    abstract Double processPrincipal(int installmentNumber);
    abstract Double processCharges(boolean latePayment);

}
