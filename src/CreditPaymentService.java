public class CreditPaymentService {
    public double calculate (int credit, int period){
        int months = period * 12;
        double monthPercent = 9.99/12/100;
        double a1 = 1 + monthPercent;
        double a2 = months;
        double k = Math.pow(a1,a2);
        double coefficient = (monthPercent*k)/(k-1);
        double monthPayment = coefficient*credit;
        return monthPayment;
    }
}
