package Arrayinjava;

public class factorials {

	static int factorial(int n) {
		if(n==0) {
			return 1;
		} else {
			return n* factorial(n-1);
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = factorial(5);
		System.out.println(c);
		}

	}


