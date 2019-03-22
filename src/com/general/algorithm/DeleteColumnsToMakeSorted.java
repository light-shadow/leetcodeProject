package com.general.algorithm;


/**
 * 944. Delete Columns to Make Sorted
 * status: pass
 */
public class DeleteColumnsToMakeSorted {

    public static void main(String[] args) {
        String[] arrs = { "cba","daf","ghi"};
        System.out.println(minDeletionSize(arrs));

    }

    public static int minDeletionSize(String[] A) {
        int countDe = 0;
        int countNotDe = 0;
        int length = A[0].length();
        for(int j=0;j<length;j++){
            StringBuilder stringBuilder = new StringBuilder("");
            String eachStr = "";
            for(int i=0;i<A.length;i++) {
                String each = A[i];
                eachStr = each.substring(j, j+1);
                stringBuilder.append(eachStr);
            }
            if(isNonDecreasing(stringBuilder.toString())){
                countNotDe++;
            }
            else{
                countDe++;
            }
        }
        return  countDe;
    }

    public static boolean isNonDecreasing(String string){
        for(int j=0;j<string.length()-1;j++){
            byte current = (byte)string.charAt(j);
            byte next = (byte)string.charAt(j+1);
            if(current<=next){
            }
            else{
                return false;
            }
        }
        return true;
    }
}
