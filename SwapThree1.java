
public class SwapThree1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//local variables
		int fno =10;
		int sno = 25;
		int thno = 30;
		System.out.println("before swapping three numbers");
		System.out.println("fno :"+fno+"\t"+"sno :"+sno+"\t"+"thno :"+thno+"\t");
		//swapping
		// with temp variable
		int temp=0;
		temp = fno;
		fno = sno;
		sno = thno;
		thno = temp;
		System.out.println("after swapping three numbers");
		System.out.println("fno :"+fno+"\t"+"sno :"+sno+"\t"+"thno :"+thno+"\t");
		

	}

}
