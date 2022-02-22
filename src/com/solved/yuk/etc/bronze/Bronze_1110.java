package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        int originNum = Integer.parseInt(line), cycle = 0;
        String input[] = line.split("");

        while (true){
            int plusNum;
            cycle++;
            if(input.length == 1){
                plusNum = Integer.parseInt(input[0]);
                input = new String[2];
                input[0] = input[1] = Integer.toString(plusNum);
            }else {
                plusNum = (Integer.parseInt(input[0])+Integer.parseInt(input[1]))%10;
                input[0] = input[1];
                input[1] = Integer.toString(plusNum);
            }
            if(input[0].equals("0")){
                String convertNum = input[1];
                input = new String[1];
                input[0] = convertNum;
            }
            if(input.length == 2 && (input[0]+input[1]).equals(line)) break;
            else if(input.length == 1 && input[0].equals(line))break;
        }
        bw.write(cycle+"");



        bw.flush();
        bw.close();
    }
}
