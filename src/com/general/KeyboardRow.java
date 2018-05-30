package com.general;

import java.util.*;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] arr = new String[]{"asdfghjkla","qwertyuiopq","zxcvbnzzm","asdfghjkla","qwertyuiopq","zxcvbnzzm"};
        String[] ret = findWords(arr);
        for (String each: ret ) {
            System.out.println(each);
        }

    }

    private static String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        String[] newArr = new String[words.length];
        String[] returnArr = new String[words.length];
        int length = words.length;
        // 先把每一个字符串转换为小写,储存在有序的hashmap中
        for(int i=0;i<length;i++)
        {
            int num1 = 0;
            int num2 = 0;
            int num3 = 0;

            String each = words[i];
            int eachLength = each.length();
            for(int j=0;j<eachLength;j++){
                if (firstRow.contains(each.toLowerCase().substring(j,j+1))){
                    num1++;
                }else if (secondRow.contains(each.toLowerCase().substring(j,j+1))){
                    num2++;
                }else if (thirdRow.contains(each.toLowerCase().substring(j,j+1))){
                    num3++;
                }
            }
            if((num1==0 && num2==0 && num3!=0) || (num1!=0 && num2==0 && num3==0) || (num1==0 && num2!=0 && num3==0)){
                returnArr[i] = words[i];
            }
        }
        List<String> strList= Arrays.asList(returnArr);
        List<String> strListNew = new ArrayList<>();
        for (int i = 0; i <strList.size(); i++) {
            if (strList.get(i)!=null&&!strList.get(i).equals("")){
                strListNew.add(strList.get(i));
            }
        }
        String[] strNewArray = strListNew.toArray(new String[strListNew.size()]);
        return   strNewArray;
    }
}
