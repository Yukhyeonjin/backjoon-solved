package com.solved.yuk.etc.silver;

import java.io.*;
import java.util.Arrays;

public class Silver_1417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), dasomVote = Integer.parseInt(br.readLine()), min = 0;
        if(N == 1) bw.write("0");
        else{
            int arr[] = new int[N-1];
            for(int i = 0; i < N-1; i ++){
                arr[i] = Integer.parseInt(br.readLine());
            }
            while (true){
                Arrays.sort(arr);
                int maxVote = arr[N-2];
                if(dasomVote > maxVote) break;
                dasomVote++;
                arr[N-2]--;
                min++;
            }
            bw.write(min+"");
        }
        bw.flush();
        bw.close();
    }
}
