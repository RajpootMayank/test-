package Array;

public class SumOfArray {
    public static void main(String[] args) {
        int[] a1={9,3,4,9};
        int[] a2={9,3,7,8,2,5};
        int a3 []=new int[7];
        int i=a1.length-1;
        int j=a2.length-1;
        int k=a3.length-1;
        int carry=0;   
        while(i>=0 || j>=0 || carry>0){
            int s=carry;
            if(i>=0) s+=a1[i];
           if(j>=0) s+=a2[j];
            a3[k]=s%10;
            carry=s/10;
            i--;
            j--;
            k--;
        }
       for(int p=0; p<a3.length; p++){
        System.out.print(a3[p]+" ");
       }
    } 
}
