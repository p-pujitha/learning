package com.interviewbit.strings;

import java.util.ArrayList;

public class DeserializeString {
    public static void main(String[] args) {
//    ArrayList<String> answer1 = deserialize("scaler6~academy7~");
//    System.out.println(answer1);
    ArrayList<String> answer2 = deserialize("mxxxzclaql10~omttepvukq10~sckhqgagqt10~miaufqvumh10~jndrqnllah10~wqlithzmfi10~oczafaqcrz10~lnubllvcsq10~rzngzhllmw10~ntpvbeyxnk10~");
    System.out.println(answer2);
    }
    public static ArrayList<String> deserialize(String A) {
        ArrayList<String> arraylist = new ArrayList<>();
        String addToArray = "";
        int j=0;
        for(int i=0; i<A.length(); i++){
            char ch = A.charAt(i);
            if(ch=='~' && i<A.length()) j=i+1;
            if(Character.isDigit(ch)){
                addToArray = A.substring(j,i);
                if(!addToArray.matches("-?\\d+")){
                    arraylist.add(addToArray);
                }
                addToArray="";
                j=i;
            }
        }
        return arraylist;
    }
}
