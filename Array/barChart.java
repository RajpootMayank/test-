package Array;

public class barChart {
    public static void main(String[] args) {
        int[] arr={8,5,3,6,1,3,5};

        int max=0;
        for(int i=0; i<arr.length; i++){
        if(arr[i]>max){ 
           max=arr[i];
        }
    }
        while(max>0){
            for(int i=0; i<arr.length; i++){
                if(arr[i]>=max){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            max--;
            System.out.println();
        }
    }
}
