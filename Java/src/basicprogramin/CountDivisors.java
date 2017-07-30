package basicprogramin;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;
/**
 *
 * @author sterben13
 */
public class CountDivisors {
    /**
     * Mediante este soluicion se obtiene una complejidad de O(n)
     * La solucion optima es n(1) donde se utiliza la siguiente formula 
     * (r/k)−((l−1/k))
     * @param args 
     */
    public static void main(String [] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedWriter bw = new BufferedWriter(osw);
        int [] number;
        int count=0;
        try{
            number = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            for (int i = number[0]; i <= number[1] ; i++) {
                if(i%number[2]==0)
                    count++;
            }
            bw.append(String.valueOf(count));
            bw.newLine();
            bw.flush();
            bw.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
}
