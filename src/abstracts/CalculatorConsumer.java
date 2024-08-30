package abstracts;

class CalculatorDummy{
	
	private int first;
	private int second;
	private int third;
	
    public void setOprands(int first, int second, int third){
    	this.first = first;
    	this.second = second;
    	this.third = third;
    }
    
    public int sum(){
    	int sum = first + second + third;
        return sum;
    }
    public int avg(){
        int avg = (first + second + third) / 3;
    	return avg;
    }
}
public class CalculatorConsumer {
    public static void main(String[] args){
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10,20,40);
        System.out.println("ÃÑÇÕ : " + c.sum() + "Æò±Õ" + c.avg());
    }
}
