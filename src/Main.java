public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double annuityPayment1 = service.calculate(1000000,12);
        System.out.println("Ежемесячныый платеж: " + annuityPayment1);

        double annuityPayment2 = service.calculate(1000000,24);
        System.out.println("Ежемесячныый платеж: " + annuityPayment2);

        double annuityPayment3 = service.calculate(1000000,36);
        System.out.println("Ежемесячныый платеж: " + annuityPayment3);
    }
}