package com.solved.yuk.etc.silver;

import java.io.*;

public class Silver_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()), count = 0;
        for(int i = 0; i < N; i ++){
            String input = br.readLine();
            boolean lineFlag = true;
            for(int j = 0; j < input.length(); j ++){
                char c = input.charAt(j);
                boolean flag = true;
                for(int k = j+1; k < input.length(); k++){
                    if(flag && c == input.charAt(k)) continue;
                    else if(!flag && c == input.charAt(k)) {
                        lineFlag = false;
                        break;
                    }
                    else flag = false;
                }
            }
            if(lineFlag) count++;
        }
        bw.write(count+"");


        bw.flush();
        bw.close();
    }
}
