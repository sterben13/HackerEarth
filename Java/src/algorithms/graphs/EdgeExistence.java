package algorithms.graphs;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * EdgeExistence
 */
public class EdgeExistence {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw  = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        String [] line;
        int n, m, a, b, q;
        boolean [][] list;
        try {
            line = br.readLine().split("\\s+");
            n = Integer.parseInt(line[0]);
            m = Integer.parseInt(line[1]);
            list = new boolean [n+1][n+1];
            for(int i =0; i<m; i++){
                line = br.readLine().split("\\s+");
                list[Integer.parseInt(line[0])][Integer.parseInt(line[1])] = true;
            }
            q = Integer.parseInt(br.readLine());
            for(int i =0; i< q; i++){
                line = br.readLine().split("\\s+");
                bw.append(list[Integer.parseInt(line[0])][Integer.parseInt(line[1])]?"YES":"NO");
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally{
            try {
                br.close();
                bw.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}