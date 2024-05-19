package Review2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercise10 {
	 public static int[] sortAscending(int[] array) {
		 for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i]>array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		 return array;
	 }
	 
	 public static List<Integer> sortList(List<Integer> list){
		 for (int i = 0; i < list.size()-1; i++) {
			 for (int j = i+1; j < list.size(); j++) {
				if(list.get(i)>list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		 
		 return list;
		 
	 }
	 
	 
	 
	 public static void display(int[] array) {
		 for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	 }
	 public static void main(String[] args) {
		int[] array = {5,2,5,2,4,3,7};
		ArrayList<Integer> list = new ArrayList<>();
		list.add(4);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(8);
		list.add(9);
		display(sortAscending(array));
		System.out.println();
		System.out.println(sortList(list));
	}
}
