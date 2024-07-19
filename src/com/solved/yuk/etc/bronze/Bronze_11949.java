package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.ArrayList;

public class Bronze_11949 {
    
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        
		ArrayList<Integer> numTicket = new ArrayList<>();
                
        for (int i = 0; i < N; i++) {
            numTicket.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 1; i <= M; i++) {
            
            for (int index = 1; index < numTicket.size(); index++) {
                
                if (numTicket.get(index - 1) % i > numTicket.get(index) % i) {
                    
                    int temp = numTicket.get(index - 1);
                    numTicket.set(index - 1, numTicket.get(index));
                    numTicket.set(index, temp);
                }
            }
        }
        
        for (int num : numTicket) {
            bw.write(num+"\n");
        }
		

        bw.flush();
        br.close();
        bw.close();
    }


    public static void main(String[] args) throws IOException {
        solution();
    }
}
