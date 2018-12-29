package com.general.algorithm;

public class GoatLatin {
    public static void main(String[] args) {
        String str ="I speak Goat Latin";
        System.out.println(toGoatLatin(str));
        System.out.println("------------------------");
        String str1 = "The quick brown fox jumped over the lazy dog";
        System.out.println(toGoatLatin(str1));
    }

    private static String toGoatLatin(String S) {
        // 拆解分割字符串
        String[] strList = S.split(" ");
        int length = strList.length;
        StringBuilder sb = new StringBuilder("");
        // 循环遍历字符串
        for(int i=0;i<length;i++){
            String each = strList[i];
            StringBuilder eachStingBui = new StringBuilder(each);
            String firstLetter = each.substring(0,1);
            if(firstLetter.equalsIgnoreCase("a")  ||
                    firstLetter.equalsIgnoreCase("e") ||
                    firstLetter.equalsIgnoreCase("i") ||
                    firstLetter.equalsIgnoreCase("o") ||
                    firstLetter.equalsIgnoreCase("u")){
            }else{
                char prefix = eachStingBui.charAt(0);
                eachStingBui.deleteCharAt(0);
                eachStingBui.append(prefix);
            }
            eachStingBui.append("ma");
            StringBuilder suffix = new StringBuilder("");
            for(int j=0;j<i+1;j++){
                suffix.append("a");
            }
            eachStingBui.append(suffix);
            sb.append(eachStingBui).append(" ");
        }
        String newStr = sb.toString();
        int length2 = newStr.length();

        return newStr.substring(0,length2-1);
    }
}
