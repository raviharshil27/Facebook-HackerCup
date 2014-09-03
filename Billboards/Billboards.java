package fb;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Billboards {
        public static void main(String[] args) throws NumberFormatException,
                        IOException {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                int n = Integer.parseInt(in.readLine());
                loop: for (int m = 1; m <= n; m++) {
                        String[] S = in.readLine().split(" ");
                        int x = Integer.parseInt(S[0]);
                        int y = Integer.parseInt(S[1]);
                        loop2: for (int i = x; i > 0; i--) {
                                int rows = 1;
                                int current = 0;
                                for (int j = 2; j < S.length; j++) {
                                        if (S[j].length() * i > x)
                                                continue loop2;
                                        if (current != 0)
                                                current += i;
                                        if (current + S[j].length() * i > x) {
                                                rows++;
                                                current = S[j].length() * i;
                                        } else {
                                                current += S[j].length() * i;
                                        }
                                }
                                if (rows * i <= y) {
                                        System.out.println("Case #" + m + ": " + i);
                                        continue loop;
                                }
                        }
                        System.out.println("Case #" + m + ": 0");
                }
        }
} 