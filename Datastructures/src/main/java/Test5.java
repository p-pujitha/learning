import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        //String input = "Java articles are Awesome";
        //
        //Output:J
        String input = "Java articles are Awesome";
//        Map<Character,Long> mapCount = input.chars()
//                .mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), HashMap::new,Collectors.counting()));
//        char value = mapCount.entrySet().stream().filter(entry -> entry.getValue()==1)
//                .map(Map.Entry::getKey).findFirst().orElse(null);
//        System.out.println(value);
        Map<Character,Integer> mapCount = new LinkedHashMap<>();
        for(int i=0; i<input.length();i++)
        {
            char c = input.charAt(i);
            mapCount.put(c,mapCount.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>entry : mapCount.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
            }
        }


    }
}
