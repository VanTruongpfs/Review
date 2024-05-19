package Learn;

import java.util.Iterator;

public class Array1D {
// kind1: (attribute) ArrayName[]
// kind2: (attribute)[] ArrayName
	
	public static void main(String[] args) {
//		int arrayA[] = new int[10];
//		int[] arrayB = new int[10];
		int arrayC [] = new int[] {1,2,3,4,5};
// in ra tat ca phan tu trong mang
	for(int j = 0; j<arrayC.length; j++ ) {
		System.out.print(arrayC[j]+" ");
	}
	System.out.println("\n");
// loai bo phan tu bang x
	int x = 3;
	for(int i = 0; i < arrayC.length; i++) {
		if(i == x ) {
			continue;
		}
		System.out.print(arrayC[i]+ " ");
	}
	int  max = Integer.MIN_VALUE;
// gia tri lon nhat cua mang
	for(int k : arrayC) {
		if(max<k) {
			max = k;
		}
	}
	System.out.println("\ngia tri lon nhat: "+max);
	int sum = 0;
// tong tat ca cac phan tu trong mang
	for(int t = 0; t < arrayC.length ;t++) {
		sum = sum + t;
	}
	System.out.println("\ntong tat ca cac phan tu: "+sum);

}
	 
}
