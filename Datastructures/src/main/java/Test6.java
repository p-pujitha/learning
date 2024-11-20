public class Test6 {
    public static void main(String[] args) {
        //1 2 3
        //4 5 6
        //7 8 9
        //Output:
        //7 4 1
        //8 5 2
        //9 6 3

         int n=3, m=3;
         int arr[][] = {
                 { 1,2, 3},
                 {4, 5, 6},
                 {7, 8, 9}
         };
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-i];
                arr[i][n-j-i]= temp;
            }
        }
        for(int i=0; i<n;i++){
           for( int j=0; j<m;j++){
    System.out.print(arr[i][j] +" ");
            }
           System.out.println();
        }
    }
}
