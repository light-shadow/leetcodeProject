package com.general.algorithm;

/**
 * 859. Buddy Strings
 * status:todo
 */
public class BuddyStrings {

    public static void main(String[] args) {
        String string1 = "ab";
        String string2 = "ba";
        System.out.println(buddyStrings(string1, string2));
    }

    public static boolean buddyStrings(String A, String B) {
        int length1 = A.length();
        int length2 = B.length();
        if(length1<2 || length1!=length2){
            return false;
        }
        if(A.equals(B)){
            return true;
        }
        int count = 0;
        for(int i=0;i<length1;i++){
            int ascii1 = A.charAt(i);
            int ascii2 = B.charAt(i);
            if(ascii1 != ascii2){
                count ++;
            }
        }
        return count == 2;

    }
}
