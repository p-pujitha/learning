import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


 class Student {
     String name;
     int totalMarks;
     Student(String name, int totalMarks){
         this.name = name;
         this.totalMarks = totalMarks;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getTotalMarks() {
         return totalMarks;
     }

     public void setTotalMarks(int totalMarks) {
         this.totalMarks = totalMarks;
     }

     @Override
     public String toString() {
         return "Student{" +
                 "name='" + name + '\'' +
                 ", totalMarks=" + totalMarks +
                 '}';
     }
 }
public class Test8 {
    public static void main(String[] args) {
        int n = 10;
//        List<Integer> numbers = IntStream.range(1,n).boxed().collect(Collectors.toList());
        List<Integer> numbers = IntStream.rangeClosed(1,n).filter(x->x%2==0).boxed().collect(Collectors.toList());
        System.out.println(numbers);

        List<Student> students = new ArrayList<>();
        students.add(new Student("s1",100));
        students.add(new Student("s2",90));
        students.add(new Student("s3",80));
        students.add(new Student("r1",90));

        Collections.sort(students, Comparator.comparing(Student::getTotalMarks).reversed().thenComparing(Student::getName));
        students.forEach(System.out::println);




    }
}
