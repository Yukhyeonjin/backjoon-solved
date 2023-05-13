package com.solved.yuk.etc.bronze;

import java.util.*;
 
public class Bronze_17174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,cnt,check;
        n = sc.nextInt();
        m = sc.nextInt();
        cnt = n;
        check = n;
        while(check >= m) {
            cnt += check / m;
            check /= m ;
        }
        System.out.println(cnt);
        sc.close();
    }
}
