package Class;

public class ProductOrderMain {

	public static void main(String[] args) {
		
		ProductOrder[] orders = new ProductOrder[3];

		ProductOrder order1 = new ProductOrder();
		order1.productName = "�κ�";
		order1.price = 2000;
		order1.quantity = 2;
		orders[0] = order1;
		
		ProductOrder order2 = new ProductOrder();
		order2.productName = "��ġ";
		order2.price = 5000;
		order2.quantity = 1;
		orders[1] = order2;
		
		ProductOrder order3 = new ProductOrder();
		order3.productName = "�ݶ�";
		order3.price = 1500;
		order3.quantity = 2;
		orders[2] = order3;
		
		for (ProductOrder p : orders) {
			System.out.println("��ǰ�� : " + p.productName
					+ "���� : " + p.price + "���� : " + p.quantity);
		}
		
		
	}

}
