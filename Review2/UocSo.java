package Review2;

import java.util.ArrayList;
import java.util.List;

public class UocSo {
	public static int uocSoChungLonNhat(int a, int b) {
		if(a==b) {
			return a;
		}else if(a>b) {
			a-=b;
		}else {
			b-=a;
		}
		return uocSoChungLonNhat(a, b);
	}
	public static List<Integer> lietKeUocSo(int n) {
		ArrayList<Integer> list =  new ArrayList<>();
		for (int i = 1; i<=n; i++) {
			if(n%i==0) {
				list.add(i);
			}
		}
		return list;
	} 
	
	public static void main(String[] args) {
		int a = 14;
		int b = 10;
		int n = 20;
		System.out.println(uocSoChungLonNhat(a, b));
		System.out.println("tat ca uoc chung cua n la: "+lietKeUocSo(n));
	}
}
