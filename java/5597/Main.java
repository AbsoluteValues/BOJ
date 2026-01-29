import java.util.*;
import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            numList.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 1; i <= 30; i++) {
            if (!numList.contains(i)) bw.write(i + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}