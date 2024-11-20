import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        int[] arr = {10,3,7,9,12};
        int first = Integer.MIN_VALUE, second= Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(arr[i]>first){
                first= arr[i];
                second =first;
            }else if( arr[i]> second && arr[i]!=first){
                second=arr[i];
            }
        }
        System.out.println(first + " "+ second);
    }

}
