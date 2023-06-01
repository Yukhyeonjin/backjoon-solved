package com.solved.yuk.etc.bronze;

import java.io.*;

public class Bronze_1434 {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]), m = Integer.parseInt(input[1]);
        String[] boxes = br.readLine().split(" "),
                 books = br.readLine().split(" ");
        int boxIndex = 0, bookIndex = 0;
        while (true){
            int box = Integer.parseInt(boxes[boxIndex]),
                book = Integer.parseInt(books[bookIndex]);
            if(box - book >= 0) {
                box -= book;
                boxes[boxIndex] = String.valueOf(box);
                bookIndex++;
            }
            else {
                boxIndex++;
            }
            if(boxIndex == n || bookIndex == m) break;
        }
        int result = 0;
        for(int i = 0; i < n; i ++){
            result += Integer.parseInt(boxes[i]);
        }
        bw.write(result+"");


        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }


}

