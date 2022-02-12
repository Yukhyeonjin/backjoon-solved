package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i = 0; i < 3; i++){
            String input[] = br.readLine().split(" ");
            int sum = 0;
            for(int j = 0; j < 4; j ++){
                sum += Integer.parseInt(input[j]);
            }
            if(sum == 0)bw.write("D\n");
            else if(sum == 1)bw.write("C\n");
            else if(sum == 2)bw.write("B\n");
            else if(sum == 3)bw.write("A\n");
            else if(sum == 4)bw.write("E\n");
        }

        bw.flush();
        bw.close();
    }
}
