package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_25501 {
    static int countRecursion = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String s = br.readLine();
            countRecursion = 0;
            bw.write(isPalindrome(s) + " " + countRecursion +" \n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static int recursion(String s, int l, int r){
        countRecursion++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
}