public class PowerOfSums {

	public static int powerSum(int n) {
		
		return pos(1,n);
		
	}
	private static int pos(int i, int n){
		if(i == n){
			return 1;
		}
		else if( i > n){
			return 0;
		}
		else{
			return pos(i+1,n) + pos(i+1, n-i);
		}
	}
}