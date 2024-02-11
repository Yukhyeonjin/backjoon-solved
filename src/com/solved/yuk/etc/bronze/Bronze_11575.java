package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.*;

public class Bronze_11575 {
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int a, b, x, t, len;
        char ch[];
        t = Integer.parseInt(br.readLine());
        while(t-->0) {
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            ch = br.readLine().toCharArray();
            len = ch.length;
            
            for(int i=0; i<len; i++) {
                x = ch[i] - 'A';
                ch[i] = (char)(((a * x + b) % 26) + 'A');
            }
            String s = new String(ch);
            System.out.println(s);
        }
    }
}
