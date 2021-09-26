
public class Program {
	 public static void main(String[] args) {
		 int[][] array = new int[6][6];
		 int k = 2;
		 for (int i = 0; i < array.length; i++) {
		        for (int j = 0; j < array[i].length; j++) {
		        	
		            array[i][j] = k % 2;
		            k++;
		        }
		        k--;
		    }
		  for (int[] anArr : array) {
		        for (int anAnArr : anArr) {
		            System.out.print(anAnArr + " ");
		        }
		        System.out.println();
		    }
	    }
}
