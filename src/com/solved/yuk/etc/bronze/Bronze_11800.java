package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_11800 {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n, a, b;
        String diceNumName[] = {"", "Yakk", "Doh", "Seh", "Ghar", "Bang", "Sheesh"};
        String sameDiceNumName[] = {"", "Habb Yakk", "Dobara", "Dousa", "Dorgy", "Dabash", "Dosh"};
        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i ++){
            String[] input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            bw.write("Case " + (i+1) + ": ");
            int small = Math.min(a,b);
            int big = Math.max(a,b);
            if(small == big){
                bw.write(sameDiceNumName[small] + "\n");
                continue;
            }
            if(small == 5 && big == 6) {
                bw.write("Sheesh Beesh\n");
                continue;
            }
            bw.write(diceNumName[big] + " " + diceNumName[small] + "\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}
