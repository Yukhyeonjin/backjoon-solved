package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.ArrayList;

public class Bronze_5218 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        // 'A' : 65
        for (int i = 0; i < N; i ++){
            String input[] = br.readLine().split(" ");
            String s1 = input[0], s2 = input[1];
            ArrayList<Integer> answer = solveAlphabetDistance(s1, s2);
            bw.write("Distances: ");
            for(Integer d : answer) {
                bw.write(d.toString()+" ");
            }
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();

    }

    private static ArrayList<Integer> solveAlphabetDistance(String s1, String s2) {

        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < s1.length(); i ++){
            int x = (int)(s1.charAt(i))-64,
                y = (int)(s2.charAt(i))-64;
            int result = y >= x ?  y-x : (y+26)-x;
            answer.add(result);
        }

        return answer;
    }
}
