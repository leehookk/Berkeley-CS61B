public class FindMax {
    public static int max(int[] m){
        if (m.length==0){
            System.out.println("error!");
        }
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m.length-1-i; j++){
                if (m[j]>m[j+1]){
                    int temp=m[j+1];
                    m[j+1]=m[j];
                    m[j]=temp;
                }
            }
        }
        return m[m.length-1];
    }
    public static void main(String[] args){
        int[] numbers=new int[]{9, 2, 15, 2, 22, 10, 6};
        int max_numbers=max(numbers);
        System.out.println(max_numbers);
    }
}
