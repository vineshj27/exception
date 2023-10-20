package java8;

public class Max {
	
	public int max(int[] ab) {
		int max = ab[0];
		
		for(int i=0; i<ab.length; i++) {
			if(max<ab[i]) {
				max=ab[i];
			}
		}
		return max;
	}
	
	public static int min(int[] bc) {
		int min = bc[0];
		for(int c : bc) {
			if(c<min) {
				min=c;
			}
		}
		return min;
	}

}
