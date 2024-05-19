package Review2;

public class Exercise15 {
	public static boolean isContainArray2(int[] arr1, int[] arr2) {
		for(int i = 0; i < arr1.length; i++) {
			int count = 0;
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i+j]!=arr2[j]) {
					break;
				}else {
					count++;
					if(count==arr2.length) {
						return true;
					}
				}
			}
		}
		return false;
	}
	public static boolean isContain(int[] arr1, int[] arr2) {
		outor:
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if(arr1[i+j]!=arr2[j]){
						continue outor;
					}
			}
				return true;
			}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,4,6,3,6};
		int[] arr2 = {2,4,6};
		System.out.println(isContainArray2(arr1, arr2));
		System.out.println(isContain(arr1, arr2));
	}
}
