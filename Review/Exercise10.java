package Review;
import java.util.ArrayList;
import java.util.List;
public class Exercise10 {
    public static int[] sortAs(int[] array){
        int temp = 0;
        for (int i = 0; i < array.length -1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
    
    public static List<Integer> sortAs(List<Integer> list){
        int temp = 0;
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i)>list.get(j)){
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
        }
    

    public static void display(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,4,8,3,5};
        List<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(8);
        display(sortAs(array));
        System.out.println();
        System.out.println(sortAs(list));
    }
}
