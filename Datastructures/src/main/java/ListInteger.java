import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInteger {
    public static void main(String[] args) {

        int[] numbers ={6,7,3,2,8};
        int[] min = new int[numbers.length];
        List<Integer> minelem = new ArrayList<>();


//        int left=0,right=0;
        for(int i=0; i<numbers.length;i++){
           int leftTotal=  calculateLeftTotal(i, numbers);
            int rightTotal = calculateRightTotal(i,numbers);
            int sub = leftTotal - rightTotal;
            min[i]= sub;
            System.out.println(numbers[i]+"--->"+min[i]);
        }
        int minimum=min[0];
        int index =0;
        for(int i=1; i<min.length;i++){
            if(min[i]<minimum){
                minimum = min[i];
                index=i;
            }
        }
//        int element = minelem.stream().min();
//        minelem.indexOf(element);

        System.out.println(minimum);
        System.out.println(index);


    }

    private static int calculateRightTotal(int index,int[] numbers) {
        int sum=0;
        for(int i=index+1; i<numbers.length;i++){
            sum+=numbers[i];
        }
        return  sum;
    }

    private static int calculateLeftTotal(int index, int[] numbers) {
        int sum = 0;
        for(int i=0; i<=index;i++){
            sum+=numbers[i];
        }
        return sum;
    }

    //employees -> id, name, department id, salary
//    select salary from employees orderby department id desc where departmentid="123";
}



