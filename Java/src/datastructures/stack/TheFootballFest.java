package datastructures.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * TheFootballFest
 */
public class TheFootballFest {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        Stack<String> stack = new Stack<>();
        String [] line;
        String current, temp;
        int t, n;
        try {
            t = Integer.parseInt(br.readLine());
            while(t-->0){
                line = br.readLine().split("\\s+");
                n = Integer.parseInt(line[0]);
                current = line[1];
                for(int i =0; i<n; i++){
                    line = br.readLine().split("\\s+");
                    if(line[0].equals("P")){
                        stack.push(current);
                        current = line[1];
                    }else{
                        temp = stack.pop();
                        stack.push(current);
                        current = temp;
                    }
                }
                bw.append("Player ");
                bw.append(String.valueOf(current));
                bw.newLine();
            }
            bw.flush();
        } catch (IOException | NumberFormatException e) {
            //TODO: handle exception
        }finally{
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                //TODO: handle exception
            }
        }
    }
}