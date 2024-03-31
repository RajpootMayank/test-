package Array;

public class Frequency {
    public static void main (String[] args) {
         
        int a[] = {0,1,2,3,2,2,5,2,5};
        int x = 2;
        int n = a.length;   
        System.out.println(frequency(a, n, x));
    }
    static int frequency(int a[],
    int n, int x)
    {
        int count = 0;
        for (int i=0; i < n; i++)
        if (a[i] == x)
            count++;
        return count;
    }
}
