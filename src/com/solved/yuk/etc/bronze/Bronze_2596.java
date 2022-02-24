package com.solved.yuk.etc.bronze;

import java.io.*;
import java.util.Arrays;

public class Bronze_2596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String arr[] = {"000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010"},
               alphabet[] = {"A","B","C","D","E","F","G","H"};
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringBuilder st = new StringBuilder();
        for(int i = 0; i < N; i ++){
            String code = input.substring((i*6), (i*6) + 6);
            int index = Arrays.asList(arr).indexOf(code);
            if(index > -1){
                st.append(alphabet[index]);
            } else {
                int count = 0;
                for(int j = 0; j < arr.length; j ++){
                    count = 0;
                    for(int k = 0; k < code.length(); k ++){
                        char ch = code.charAt(k),
                             alphabetChar = arr[j].charAt(k);
                        if(ch != alphabetChar) count++;
                        if(count > 1) break;
                    }
                    if(count <= 1) {
                        st.append(alphabet[j]);
                        break;
                    }
                }
                if(count > 1) {
                    st.setLength(0);
                    st.append((i+1)+""); break;
                }
            }
        }
        bw.write(st.toString());

        bw.flush();
        bw.close();
    }
}
