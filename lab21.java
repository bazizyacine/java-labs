import java.util.Arrays;
import java.util.Scanner;

public class lab21 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.printf("Len = ");
		int len = sc.nextInt();
		
		int[] Tab = new int[len];

		for (int i = 0 ; i < Tab.length ; i++) {
			Tab[i] = sc.nextInt();
			System.out.printf("Tab[%d] = %d\n", i, Tab[i]);
		}
		
		System.out.printf("Tab[] : %s\n", Arrays.toString(Tab));
		
		Arrays.sort(Tab);
		
		System.out.printf("Sort Tab[] : %s\n", Arrays.toString(Tab));
		
		System.out.printf("intKey = ");
		int intKey = sc.nextInt();
		
		System.out.println("Key " + intKey + " found at index = "
                + Arrays.binarySearch(Tab, intKey)); 
		
		sc.close();
	}
}
