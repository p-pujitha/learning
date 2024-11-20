public class secondlargest {
    public static void main(String[] args) {
        int[] arr= {3,2,1,5,6,4};
        int first=Integer.MIN_VALUE, second= Integer.MIN_VALUE;
        for(int num:arr){
            if(num >first){
                second = first;
                first=num;
            }else if(num >second && num!=first){
                second = num;
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("no second element");
        }
        System.out.println(second);
    }
}
