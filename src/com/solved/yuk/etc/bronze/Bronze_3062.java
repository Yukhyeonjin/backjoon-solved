package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_3062 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()), org, rev, reuslt;
        String[] input;
        String line, newLine = "", resultLine = "";
        for(int i = 0; i < T; i ++){
            line = br.readLine();
            input = line.split("");
            org = Integer.parseInt(line);

            newLine = "";
            for(int j = input.length-1; j >= 0; j --){
                newLine += input[j];
            }
            rev = Integer.parseInt(newLine);
            resultLine = String.valueOf(org+rev);
            int resultLineLength = resultLine.length();
            boolean flag = true;
            for(int j = 0; j < resultLineLength/1; j ++){
                if(resultLine.charAt(j) != resultLine.charAt(resultLineLength-1-j)) {
                    flag = false;
                    break;
                }
            }
            bw.write(flag ? "YES\n" : "NO\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

