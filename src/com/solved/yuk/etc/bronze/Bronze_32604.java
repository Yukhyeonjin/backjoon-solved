package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_32604 {
    static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int a=0,b=0;
        int tempA=-1, tempB=-1;
        boolean flag = true;
        for (int i = 0; i < N; i ++){
            String[] input = br.readLine().split(" ");
            tempA = Integer.parseInt(input[0]);
            tempB = Integer.parseInt(input[1]);
            if(tempA >= a) {
                a = tempA;
            } else {
                flag = false; 
                break;
            }
            if(tempB >= b) {
                b = tempB;
            } else {
                flag = false; 
                break;
            }
        }
        if(flag) bw.write("yes");
        else bw.write("no");
        
        

        bw.flush();
        br.close();
        bw.close();
    }
    
    public static void main(String[] args) throws Exception {
        solution();
    }
}
