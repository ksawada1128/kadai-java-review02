
public class Review01 {

    public static void main(String[] args) {
        int num = 1500;
        int tax = (int)tax(num);
        int result = num + tax;
        System.out.println(num + "円の商品の税込価格は" + result + "円（消費税は" + tax + "円）です。");
    }
    public static double tax(double num1) {
        double taxRate = 0.1;
        double taxNum = num1 * taxRate;
        return taxNum;
    }

}
