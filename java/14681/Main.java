import java.io.*;

public class Main {
    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int quadrantNumber = 0;

        if (x > 0 && y > 0) quadrantNumber = 1;
        else if (x < 0 && y > 0) quadrantNumber = 2;
        else if (x < 0 && y < 0) quadrantNumber = 3;
        else if (x > 0 && y < 0) quadrantNumber = 4;

        bw.write(String.valueOf(quadrantNumber));
        bw.flush();
        bw.close();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }
}