package Array;

public class findElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,4,8,9,5};
        int X = 8;
        int n = arr.length;
        int i =0;
        while(i < n){
             if(arr[i] == X){
                System.out.println(i);
             }
             i++;
        }
    }
}
