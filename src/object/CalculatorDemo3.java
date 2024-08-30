package object;
 
class DivisionableCalculator extends Calculator {
    public void division() {
        System.out.println("mul = " + this.left / this.right);
    }
}
 
public class CalculatorDemo3 {
 
    public static void main(String[] args) {
 
    	DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.division();
    }
 
}