package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_2028 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        String input, powInput;
        int inputNum, powInputNum;
        StringBuffer sb;
        for(int i = 0; i < T; i ++){
            input = br.readLine();
            inputNum = Integer.parseInt(input);
            powInputNum = inputNum*inputNum;
            powInput = String.valueOf(powInputNum);

            sb = new StringBuffer(powInput);
            powInput = sb.reverse().toString();
            sb = new StringBuffer(input);
            input = sb.reverse().toString();
            if(powInput.substring(0,input.length()).equals(input)) bw.write("YES\n");
            else bw.write("NO\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

