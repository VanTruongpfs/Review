package Review;

public class Exercise15 {
    public static String encode(String str, int col){
        String result = "";
        int row = str.length()%col==0?str.length()/col:(str.length()/col)+1;
        char[][] matrix = new char[row][col];
        int count = 0;
        
        while (str.length()<row*col) {
            str+=" ";
        }

        str = str.replace(' ', '-');

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] =  str.charAt(count++);
            }
        }
        display(matrix);
        
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                result += matrix[i][j];
            }
        }
        return result;
    }

    public static String descrypt(String str1, int col){
        String result = "";
        int row = str1.length()/col;
        char[][] matrix = new char[row][col];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = str1.charAt(count++);
            }
        }
        display(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result += matrix[i][j];
            }
        }
        result = result.replace('-', ' ');
        return result;
    }
    
    public static void display(char[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String str = "I am student";
        int col = 5;
        String str1 = encode(str, col);
        System.out.println();
        System.out.println(encode(str, 5));
        System.out.println(descrypt(str1, col));


      
    }
}