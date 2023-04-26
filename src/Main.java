import java.security.Provider;

public class Main {
    public static void main(String[] args) {
        Object CreditPaymentService = new CreditPaymentService();
        int period = 12;
        int summ = 1_000_000;
        double mouthPayment = service.calculate(period, summ);
        System.out.println(mouthPayment);
    }
}