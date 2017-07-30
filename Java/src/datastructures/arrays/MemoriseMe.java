package datastructures.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/**
 * MemoriseMe
 */
public class MemoriseMe {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String[] line;
        int n, q, qi;
        int[] array = new int[100001];
        try {
            n = Integer.parseInt(br.readLine());
            line = br.readLine().split("\\s+");
            for (int i = 0; i < line.length; i++) {
                array[Integer.parseInt(line[i])]++;
            }
            q = Integer.parseInt(br.readLine());
            for (int i = 0; i < q; i++) {
                qi = Integer.parseInt(br.readLine());
                if (array[qi] > 0) {
                    bw.append(String.valueOf(array[qi]));
                } else {
                    bw.append("NOT PRESENT");
                }
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

}