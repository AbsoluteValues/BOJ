import java.util.*;
import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    sb.append(s.charAt(j));
                }
            }

            bw.write(sb.toString() + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}