package object;

class Calculator{
	static double PI = 3.14;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println("sum = " + (this.left+this.right));
	}
	
	public void avg() {
		System.out.println("avg = " + ((this.left+this.right)/2));
	}
}
public class CalculatorDemo4 {
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(10, 20);
		c2.sum();
		c2.avg();
		
		
	}

}
