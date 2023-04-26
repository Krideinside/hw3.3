public class CreditPaymentService {
    public double calculate(int period, int summ) {
        double mouthPercent = 9.99 / period;
        double y = Math.pow(1 + mouthPercent, period); // переменная в формуле рассчета коэффициета аннуитета
        double ratioAnnuity = (mouthPercent * y) / (y - 1);
        double mouthPayment = ratioAnnuity * summ;
        return mouthPayment;
    }
}