public class Test9 {
    public static void main(String[] args) {
        int[] arr = {40, 6, 3, 18, 7, 5, 10};
//        int first= Integer.MIN_VALUE, second= Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>first){
//                second= first;
//                first = arr[i];
//            }else if(arr[i] != first && arr[i] >second){
//                second= arr[i];
//            }
//        }
//        System.out.println(first + " "+ second);
        // find max diiference between elements and j>i
        // a[j] > a[i] and
        int minElement = arr[0];
        int maxDiff = Integer.MIN_VALUE;
        for(int j = 1; j< arr.length; j++){
            int difference = arr[j] - minElement;
            if(difference > maxDiff){
                maxDiff = difference;
            }
            if(arr[j] < minElement){
                minElement = arr[j];
            }
        }

        System.out.println(maxDiff);

        String test = "abcba";
    }
    //
}
