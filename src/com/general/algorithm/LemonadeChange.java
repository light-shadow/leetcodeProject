package com.general.algorithm;


/**
 * 860. Lemonade Change
 * status: pass
 * refrence: https://blog.csdn.net/fuxuemingzhu/article/details/80913955
 */
public class LemonadeChange {

    public static void main(String[] args) {

    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int each: bills){
            if(each == 5){
                five++;
            }
            else if(each == 10){
                if(five==0){
                    return false;
                }
                else{
                    five--;
                    ten++;
                }
            }
            else  if(each == 20){
                if(ten == 0){
                    if(five<3){
                        return false;
                    }
                    else{
                        five-=3;
                    }
                }
                else{
                    if(five==0){
                        return false;
                    }
                    else{
                        ten--;
                        five--;
                    }
                }
            }
        }
        return true;
    }
}
