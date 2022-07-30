package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_2684 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int P = Integer.parseInt(br.readLine()), arr[] = new int[8];
        for(int i = 0; i < P; i ++){
            String input = br.readLine();
            Arrays.fill(arr,0);
            for(int j = 0; j < input.length()-2; j ++){
                char a = input.charAt(j), b = input.charAt(j+1), c = input.charAt(j+2);
                if(a == 'T' && b == 'T' && c == 'T') arr[0]++;
                else if(a == 'T' && b == 'T' && c == 'H') arr[1]++;
                else if(a == 'T' && b == 'H' && c == 'T') arr[2]++;
                else if(a == 'T' && b == 'H' && c == 'H') arr[3]++;
                else if(a == 'H' && b == 'T' && c == 'T') arr[4]++;
                else if(a == 'H' && b == 'T' && c == 'H') arr[5]++;
                else if(a == 'H' && b == 'H' && c == 'T') arr[6]++;
                else if(a == 'H' && b == 'H' && c == 'H') arr[7]++;
            }
            for(int j = 0; j < arr.length; j ++){
                bw.write(arr[j]+" ");
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}