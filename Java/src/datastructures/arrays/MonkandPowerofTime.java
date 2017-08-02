package datastructures.arrays;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

/**
 * MonkandPowerofTime
 */
public class MonkandPowerofTime {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        Queue<String> queue = new LinkedList<>();
        int n;
        String [] a;
        int cont = 0;
        try {
            n = Integer.parseInt(br.readLine());
            a = br.readLine().split("\\s+");
            for (int i = 0; i < n; i++) {
                queue.add(a[i]);
            }
            a = br.readLine().split("\\s+");
            for(int i = 0; i<n; i++){
                while(true){
                    String temp = queue.poll();
                    if(a[i].equals(temp)){
                        cont++;
                        break;
                    }else{
                        cont++;
                        queue.add(temp);
                    }
                }
            }
            bw.append(String.valueOf(cont));
            bw.newLine();
            bw.flush();
        } catch (IOException | NumberFormatException e) {
            //TODO: handle exception
        } finally {
            try {
                br.close();
                bw.close();
            } catch (IOException e) {
                //TODO: handle exception
            }
        }
    }
}