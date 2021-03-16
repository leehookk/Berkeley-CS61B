import java.util.Scanner;
import java.util.ArrayList;
public class BreakContinue {
    public static void windowPosSum(int[] m, int n){
        for (int i=0; i<m.length-1; i++){
            if (m[i]<0)
                continue;
            int sum=0;
            for (int j=0; j<=n; j++) {
                if (i+j>m.length-1){
                    m[i]=sum;
                    break;
                }
                sum=sum+m[i+j];
            }
            m[i]=sum;
        }
    }
    public static void main(String[] args){
        int[] a=new int[]{1, 2, -3, 4, 5, 4};
        int n=3;
        windowPosSum(a,n);
        System.out.println(java.util.Arrays.toString(a));
    }
}
