package com.general.algorithm;

/**
 * 999. Available Captures for Rook
 * status: pass
 * reference: https://www.cnblogs.com/seyjs/p/10432115.html
 */
public class AvailableCapturesForRook {

    public static void main(String[] args) {
        char[][] arrs = {
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(numRookCaptures(arrs));

    }

    public static int numRookCaptures(char[][] board) {
        int count = 0;
        int x = 0;
        int y = 0;
        for(int i=0;i<board.length;i++){
            char[] each = board[i];
            for(int j=0;j<each.length;j++){
                if(board[i][j] == 'R'){
                    y = i;
                    x = j;
                    break;
                }
            }
        }
        // 向上
        for(int i=y-1;i>=0;i--){
            if(board[i][x] == '.'){

            }
            else if(board[i][x] == 'p'){
                count++;
                break;
            }
            else {
                break;
            }
        }
        // 向下
        for(int i=y+1;i<board.length;i++){
            if(board[i][x] == '.'){

            }
            else if(board[i][x] == 'p'){
                count++;
                break;
            }
            else {
                break;
            }
        }
        // 向左
        for(int i=x-1;i>=0;i--){
            if(board[y][i] == '.'){

            }
            else if(board[y][i] == 'p'){
                count++;
                break;
            }
            else {
                break;
            }
        }
        // 向右
        for(int i=x+1;i<board[y].length;i++){
            char each = board[y][i];
            if(each == '.'){

            }
            else if(each == 'p'){
                count++;
                break;
            }
            else {
                break;
            }
        }
        return count;
    }
}
