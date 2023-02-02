package dxc;

public class Bill {
	static int counter;
	String BillId;
	String paymentMode;
	static
	{
		counter=9000;
	}
	

	public Bill(String paymentMode) 
	{
		
		this.paymentMode = paymentMode;
	}


	public String getBillId() {
		return BillId="B"+ ++counter;
	}


	public void setBillId(String billId) {
		BillId = billId;
	}


	public String getPaymentMode() {
		return paymentMode;
	}


	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	public static int getCounter() {
		return counter;
	}


	public static void setCounter(int counter) {
		Bill.counter = counter;
	}


	public static void main(String[] args) {
		
		Bill bill1 = new Bill("DebitCard");
		 Bill bill2 = new Bill("PayPal");

		 //Create more objects and add them to the bills array for testing your code

		 Bill[] bills = { bill1, bill2 };

		 for (Bill bill : bills) {
		 System.out.println("Bill Details");
		 System.out.println("Bill Id: " + bill.getBillId());
		 System.out.println("Payment method: " + bill.getPaymentMode());
		 System.out.println();
		 }
		// both methods are same only
		/*
		Bill b1=new Bill("Debit Card");
		System.out.println("Bill Details \n Bill Id:"+b1.getBillId()+"\n Payment method:"+b1.paymentMode);
		Bill b2=new Bill("Paypal");
		System.out.println("\n Bill Details \n Bill Id:"+b2.getBillId()+"\n Payment method:"+b2.paymentMode);
	*/
	}

}
