import java.util.ArrayList;
import java.util.List;

//Input: String str = “ABC”
//Output: “ABC”, “ACB”, “BAC”, “BCA”, “CBA”, “CAB”
//
public class Test2 {
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        String prefix = "";
        List<String>  permutations = callPermutations(prefix,str);
        System.out.println(permutations);

    }

    private static List<String> callPermutations(String prefix, String str) {
        int n = str.length();
        List<String> permutations = new ArrayList<>();

        if(n==0){
            permutations.add(prefix);
        }else{
            for(int i=0;i<n;i++){
                permutations.addAll(callPermutations(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1)));
            }
        }
        return permutations;
    }
}
