public class prg1 {
    public static void main(String[] args) {
        //Given two strings S1 and S2, The task is to find if S1 is a substring of S2. If yes, return the index of the first occurrence, else return -1. You cannot use functions such as substring or equals.
        //
        //Examples :
        //
        //Input: S1 = “test”, S2= “thisisatest”
        //Output: 7
        //Explanation: String “test” is present as a substring of s2.
        //
        //Input: S1 = “test”, S2= “thistestisapretest”
        //Output: 4
        //Explanation: String “test” is present as a substring of s2.
        //
        //Input: S1 = “practice”, S2= “thisisatest”
        //Output: -1.
        //Explanation: There is no occurrence of “practice” in “thisisatest”

        String s1 = "practice";
        String s2 = "thisisatest";
        boolean found = false;
       int leng1 = s1.length();
       int leng2 = s2.length();
       if(leng1>leng2){
           System.out.println("-1");
       }
       int j;
       for(int i=0;i<=leng2-leng1;i++){
           for(j=0;j<leng1;j++){
               if(s2.charAt(i+j)!=s1.charAt(j)){
                   break;
               }
           }
           if(j==leng1){
               System.out.println("yes");
               System.out.println(i);
               found = true;
               break;
           }
       }
       if(!found){
           System.out.println("not found");
       }

       String s3 = new String("test");
       String s4 =  new String("test");
       if(s3==s4){
           System.out.println("true");
       }else{
           System.out.println("false");
       }
        if(s3.equals(s4)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
