package bronze;

import java.io.*;

public class Bronze_1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]), M = Integer.parseInt(input[1]);
        boolean arr[][] = new boolean[N][M];
        for(int i = 0; i < N; i ++){
            input = br.readLine().split("");
            for(int j = 0; j < M; j ++){
                arr[i][j] = "X".equals(input[j]) ? true : false;
            }
        }
        int row = 0, col = 0;
        for(int i = 0; i < N; i ++){
            boolean isX = false;
            for(int j = 0; j < M; j ++){
                if(arr[i][j]) {
                    isX = true;
                    break;
                }
            }
            if(!isX) row++;
        }

        for(int i = 0; i < M; i ++){
            boolean isX = false;
            for(int j = 0; j < N; j ++){
                if(arr[j][i]) {
                    isX = true;
                    break;
                }
            }
            if(!isX) col++;
        }
        bw.write(Math.max(row,col)+"");

        bw.flush();
        br.close();
        bw.close();
    }
}
