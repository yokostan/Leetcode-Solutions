// simple math solution without any dynammic programming

class Solution {
	public int integerBreak(int n) {
		if(n==2)
			return 1;
		if(n==3)
			return 2;
		if(n==4)
			return 4;
		int check = n%3;
		n/=3;
		if(check ==1)
			return ((int)Math.pow(3,n-1)*4);
		else if(check == 0)
			return (int)Math.pow(3,n);
		else
			return ((int)Math.pow(3,n)*2);

	}
}
