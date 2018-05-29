package com.general;

public class JudgeRouteCircle {
    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println(judgeCircle("LL"));
        System.out.println(judgeCircle("RR"));
    }
    private static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for(int i=0;i<moves.length();i++){
            String each = moves.substring(i,i+1);
            switch (each) {
                case "U":
                    y++;
                    break;
                case "D":
                    y--;
                    break;
                case "L":
                    x--;
                    break;
                case "R":
                    x++;
                    break;
                default:
            }
        }
        if(x==0 && y==0){
            return true;
        }else{
            return false;
        }

    }
}
