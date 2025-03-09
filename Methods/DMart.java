class DMart{
	public static void price(double amount){
		System.out.println(amount);
	}
	
	public static void orderId(int id){
		System.out.println(id);
	}
	
	public static void customer(String name)
	{
		System.out.println(name);
	}
	
	public static void payment(String paymentMethod,boolean isPaid)
	{
		System.out.println(paymentMethod);
		System.out.println(isPaid);
	}
	
	public static void addItem(String item, int quantity)
	{
		System.out.println(item);
		System.out.println(quantity);
	}
	
	public static void employee(String empName, double salary, String department)
	{
		System.out.println(empName);
		System.out.println(salary);
		System.out.println(department);
	}
	
	public static void tax(double taxRate, int total, String code)
	{
		System.out.println(taxRate);
		System.out.println(total);
		System.out.println(code);
	}
}

class DMartRunner{
	public static void main(String[] args)
	{
		
		double amount=200.25;
		DMart.price(amount);
		
		int id=254;
		DMart.orderId(id);
		
		String custName="Vasuki";
		DMart.customer(custName);
		
		String paymentMethod = "Credit Card";
		boolean paid=true;
		DMart.payment(paymentMethod, paid);
		
		String itemName="Milk";
		int quantity=2;
		DMart.addItem(itemName,quantity);
		
		String empName="Rakesh";
		double salary=15000.25;
		String department="Grocery";
		DMart.employee(empName,salary,department);
		
		double taxRate=8.5;
		int total=92;
		String code="AB101";
		DMart.tax(taxRate,total,code);
	}
}