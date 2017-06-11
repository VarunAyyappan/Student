package jrJava.twoDimenArray;

public class Practice1 {

	public static void main(String[] args) {
		
		int[][] a = new int[4][];
		
		//System.out.println(a[0]);
		//System.out.println(a[a.length-1]);
		
		a[0] = new int[]{100, 101, 102};
		a[1] = new int[]{50,51,52,53,54,55};
		a[2] = new int[4];
		a[3] = new int[]{-1, -2, -3, -4, -5};	
		// a[4] not initialized
		
		a[2][1] = 10;
		//System.out.println(a[2][1]);
		//System.out.println(a[2]);
		
		/*for(int i=0;i<a[2].length;i++){
			System.out.println(a[2][i]);
		}*/
		
		for(int i=0;i<a[a.length-1].length;i++){
			System.out.println(a[a.length-1][i]);
		}
		
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println( "("+i+", "+j+") : " + a[i][j]);
			}
		}
		
	}

}
