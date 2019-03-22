package com.general.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 *929. Unique Email Addresses
 */
public class UniqueEmailAddresses {

    public static void main(String[] args) {
        String[] arr = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        String[] arr1 = {"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"};
//        numUniqueEmails(arr);
        numUniqueEmails(arr1);
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>(emails.length);
        for(String each: emails){
            int index = each.indexOf("+");
            int index2 = each.indexOf("@");
            StringBuilder stringBuilder = new StringBuilder("");
            for(int i=0;i<each.length();i++){
                char c = each.charAt(i);
                String  eachStr = String.valueOf(c);
                // 没有+
                if(index == -1){
                    if(i <index2){
                        if(".".equals(eachStr)){

                        }
                        else{
                            stringBuilder.append(eachStr);
                        }
                    }
                    else if(i>=index2){
                        stringBuilder.append(eachStr);
                    }
                }
                else{
                    if(i>=index && i <index2){
                    }
                    else if(i>=index2){
                        stringBuilder.append(eachStr);
                    }
                    else if(i<=index){
                        if(".".equals(eachStr)){

                        }else{
                            stringBuilder.append(eachStr);
                        }
                    }
                }
            }
            set.add(stringBuilder.toString());
        }
        System.out.println(set);
        return set.size();
    }


}
