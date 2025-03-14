package abstraction;

public class HomeLoan2 extends loanMaster {

    // Constructor
    public HomeLoan2(String loanNumber, Double loanAmount, Double interestRate, Integer tenureInMonth) {
        super(loanNumber, loanAmount, interestRate, tenureInMonth);
    }

    // Calculate interest for the home loan
    @Override
    Double calculateInterest() {
        return this.loanAmount * this.interestRate * (1.0 / 12);
    }

    @Override
    Double processPrincipal(int installmentNumber) {
        if (installmentNumber > 24) {
            // Assuming principal is paid off evenly after 24 months
            return this.loanAmount / (this.tenureInMonth - 24);
        }
        return 0.0;
    }

    @Override
    Double processCharges(boolean latePayment) {
        if (latePayment) {
            return 5000.0;
        }
        return 0.0;
    }

    // Optional: A method to display loan details
    public void displayLoanDetails() {
        System.out.println("Loan Number: " + this.loanNumber);
        System.out.println("Loan Amount: " + this.loanAmount);
        System.out.println("Interest Rate: " + this.interestRate);
        System.out.println("Tenure: " + this.tenureInMonth + " months");
    }

    // Optional: Method to calculate total loan payment
    public Double calculateTotalPayment() {
        Double totalInterest = calculateInterest();
        Double totalPrincipal = this.loanAmount;
        return totalPrincipal + totalInterest;
    }
}
