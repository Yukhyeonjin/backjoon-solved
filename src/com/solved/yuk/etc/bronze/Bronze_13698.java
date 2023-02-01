package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_13698 {
    static String arr[] = {"A","B","C","D",""};

    public static void changePosition(int x, int y){
        arr[4] = arr[x];
        arr[x] = arr[y];
        arr[y] = arr[4];
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        for(int i = 0; i < input.length(); i ++){
            char c = input.charAt(i);
            switch (c) {
                case 'A' :
                    changePosition(0,1);
                    break;
                case 'B' :
                    changePosition(0,2);
                    break;
                case 'C' :
                    changePosition(0,3);
                    break;
                case 'D' :
                    changePosition(1,2);
                    break;
                case 'E' :
                    changePosition(1,3);
                    break;
                case 'F' :
                    changePosition(2,3);
                    break;
            }
        }
        int small = 0, big = 0;
        for(int i = 0; i < 4; i ++){
            if("A".equals(arr[i])) small = i+1;
            if("D".equals(arr[i])) big = i+1;
        }
        bw.write(small+"\n"+big);

        bw.flush();
        br.close();
        bw.close();
    }
}
