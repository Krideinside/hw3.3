import java.security.Provider;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int period = 12;
        int summ = 1_000_000;
        int mouthPayment = (int) service.calculate(period, summ);
        System.out.println(mouthPayment);
    }
}