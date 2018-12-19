package com.general;

public class MostCommonWord {

    public static void main(String[] args) {
        String str = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] strList = new String[2];
        mostCommonWord(str, strList);

    }

    private static String mostCommonWord(String paragraph, String[] banned) {
        // 先把!?',;.这些字符全部转换为空格
        // 对字符串进行空格切分，全部转换为小写，切分后的结果放置到ArrayList中
        // 去除ArrayList中的baned中的字符串
        // 统计出现次数最多的字符串 !?',;.
        String newStr = paragraph.replaceAll("!","").replaceAll("/?", "").
                replaceAll("/,", "").replaceAll(";", "").
                replaceAll("/.", "");
        System.out.println(newStr);

        return "";
    }
}
