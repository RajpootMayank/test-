package Array;

public class SubArray {
    public static void main(String[] args) {
    int [] arr = {10,20,30,40,50};
    for(int sp=0; sp<arr.length; sp++){
        for(int ep=sp; ep<arr.length; ep++){
            for(int k=sp; k<=ep; k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }
}
}
