package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = Integer.parseInt(br.readLine());
        while (true) {
            String str = br.readLine();
            if("=".equals(str)) break;
            switch (str){
                case "+" :
                    sum += Integer.parseInt(br.readLine());
                    break;
                case "-" :
                    sum -= Integer.parseInt(br.readLine());
                    break;
                case "*" :
                    sum *= Integer.parseInt(br.readLine());
                    break;
                case "/" :
                    sum /= Integer.parseInt(br.readLine());
                    break;
            }
        }
        bw.write(sum+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
