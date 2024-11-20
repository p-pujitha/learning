package com.interviewbit.strings;

import java.util.Arrays;

public class zigzagconcat {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int n = 3;
        String zigzagString = getZigZagString(s,n);

        System.out.println(zigzagString);
        String s1 = "kHAlbLzY8Dr4zR0eeLwvoRFg9r23Y3hEujEqdio0ctLh4jZ1izwLh70R7SAkFsXlZ8UlghCL95yezo5hBxQJ1Td6qFb3jpFrMj8pdvP6M6k7IaXkq21XhpmGNwl7tBe86eZasMW2BGhnqF6gPb1YjCTexgCurS";
        int n1= 1;
        String zigzagString1 = getZigZagString(s1,n1);

        System.out.println(zigzagString1);
    }

    private static String getZigZagString(String s, int n) {
        if(s.length()<=1 ||n==1) return s;
        String ans="";
        String arr[] = new String[n];
        Arrays.fill(arr,"");
        boolean down = true;
        int row =0;
        for(int i=0; i<s.length(); i++){
            arr[row]+=s.charAt(i);
            if(row==n-1){
                down=false;
            }else if(row==0){
                down=true;
            }
            if(down){
                row++;
            }else{
                row--;
            }
        }
        for(String value: arr){
            ans+=value;
        }
        return ans;
    }
}
