package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_6841 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;
        while ((input = br.readLine()) != null) {
            if(input.equals("CU")) {
                bw.write("see you");
            }else if(input.equals(":-)")) {
                bw.write("I’m hinputppy");
            }else if(input.equals(":-(")) {
                bw.write("I’m unhappy");
            }else if(input.equals(";-)")) {
                bw.write("wink");
            }else if(input.equals(":-P")) {
                bw.write("stick out my tongue");
            }else if(input.equals("(~.~)")) {
                bw.write("sleepy");
            }else if(input.equals("TA")) {
                bw.write("totally awesome");
            }else if(input.equals("CCC")) {
                bw.write("Canadian Computing Competition");
            }else if(input.equals("CUZ")) {
                bw.write("because");
            }else if(input.equals("TY")) {
                bw.write("thank-you");
            }else if(input.equals("YW")) {
                bw.write("you’re welcome");
            }else if(input.equals("TTYL")) {
                bw.write("talk to you later");
            }else {
                bw.write(input);
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

