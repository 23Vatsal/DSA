package Lecture27;

import java.util.*;
public class HashmapPrac {
    public static void main(String[] args) {

        String str="abbbdcba";
        System.out.println(freq(str));

    }
    public static HashMap<Character,Integer> freq(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }

        }
        return map;
    }
}
