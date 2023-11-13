package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_5656 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input;
        int i = 1, a, b;
        while (true){
            input = br.readLine().split(" ");
            if("E".equals(input[1])) break;
            bw.write("Case " + i + ": ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[2]);
            if(">".equals(input[1])){
                if(a > b) bw.write("true");
                else bw.write("false");
            }
            else if(">=".equals(input[1])){
                if(a >= b) bw.write("true");
                else bw.write("false");
            }
            else if("<".equals(input[1])){
                if(a < b) bw.write("true");
                else bw.write("false");
            }
            else if("<=".equals(input[1])){
                if(a <= b) bw.write("true");
                else bw.write("false");
            }
            else if("==".equals(input[1])){
                if(a == b) bw.write("true");
                else bw.write("false");
            }
            else if("!=".equals(input[1])){
                if(a != b) bw.write("true");
                else bw.write("false");
            }
            bw.newLine();
            i++;
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }


}

