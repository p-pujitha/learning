import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test7 {
    public static void main(String[] args) {
//        List<Integer> oneToTen = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 6, 3, 8, 9, 10);
//        List<Integer> duplic = oneToTen.stream().distinct().collect(Collectors.toList());
//        System.out.println(duplic);
//        Map<String,List<Integer>> evenoroddmap = duplic.stream().collect(Collectors.groupingBy(num ->num%2==0 ? "even":"odd"));
//        System.out.println(evenoroddmap);
        StreamSources.intNumbersStream().forEach(e ->StreamSources.userStream().forEach(User::getId));


    }
}
