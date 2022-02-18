public class CreditPaymentService {
    public double calculate(double sum, int term) {
        double percent = 0.0999, monthlyPayment = sum / term, annuityRatio, monthlyPercent = percent / 12;
        annuityRatio = monthlyPercent * Math.pow(monthlyPercent+1,term) / (Math.pow(monthlyPercent+1,term)-1);
        double annuityPayment;
        annuityPayment = annuityRatio * sum;
        return annuityPayment;
    }
}