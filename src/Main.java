public class Main {
    public static void main(String[] args){
        CreditPaymentService service = new CreditPaymentService();
        double payment = service.calculate(1_000_000, 1);
        System.out.println((int)payment);
    }
}
