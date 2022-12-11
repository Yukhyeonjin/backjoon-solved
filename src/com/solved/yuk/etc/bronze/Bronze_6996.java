package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_6996 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            char original[] = input[0].toCharArray(),
                 compare[] = input[1].toCharArray();
            Arrays.sort(original);
            Arrays.sort(compare);
            bw.write(input[0] + " & " + input[1] + " are ");
            if(Arrays.equals(original,compare)){
                bw.write("anagrams.\n");
            }
            else {
                bw.write("NOT anagrams.\n");
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}