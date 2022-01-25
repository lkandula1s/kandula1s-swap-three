
public class SwapThree2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//local variables
		int fno = 10;
		int sno = 20;
		int thno = 30;
		System.out.println("Before swapping three numbers");
		System.out.println("fno :"+fno+"\t"+"sno :"+sno+"\t"+"thno :"+thno+"\t");
		//without temp variables
		//swapping
		fno = fno+sno+thno;// 10+20+30=60
		fno = thno-sno-fno;// 30-20-60=-50
		sno = fno-sno-thno;// -50-20-30=-100
		thno = sno-fno-thno;// (-100)-(-50)-30 = -80
		System.out.println("after swapping three numbers");
		System.out.println("fno :"+fno+"\t"+"sno :"+sno+"\t"+"thno :"+thno+"\t");
		
		

	}

}
