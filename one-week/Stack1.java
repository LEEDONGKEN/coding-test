package arr;

import java.io.*;

public class Stack1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int topIndex = -1;
        while (N -- > 0){
        String[] cmd = br.readLine().split(" ");
        if(cmd[0].equals("push")){
            stack[++topIndex] = Integer.parseInt(cmd[1]);
        } else if(cmd[0].equals("pop")){
            bw.append(topIndex < 0 ? "-1\n" : stack[topIndex--]+"\n");
        } else if(cmd[0].equals("size")){
            bw.append(topIndex + 1 + "\n");
        } else if(cmd[0].equals("empty")){
            bw.append(topIndex == -1 ? "1\n" : "0\n");
        } else if(cmd[0].equals("top")){
            bw.append(topIndex < 0 ? "-1\n" : stack[topIndex]+"\n");
        }
        }
        bw.flush();

    }
}
