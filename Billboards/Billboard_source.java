/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package billboard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Harshil
 */
public class Billboard
{
    public static void main(String[] args) throws NumberFormatException,
                        IOException
    {
        File f1 = new File("C:/Users/Harshil.Harshil-PC/Desktop/Facebook/Billboards/input.txt");
        File f2 = new File("C:/Users/Harshil.Harshil-PC/Desktop/Facebook/Billboards/output.txt");

        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2);
        BufferedWriter bw = new BufferedWriter(fw);

        BufferedReader br = new BufferedReader(fr);
        int n;
        n = Integer.parseInt(br.readLine());
        System.out.println(n);
        loop:
        for (int m = 1; m <= n; m++) {
            String[] S = br.readLine().split(" ");
            int x = Integer.parseInt(S[0]);
            int y = Integer.parseInt(S[1]);
            loop2:
            for (int i = x; i > 0; i--) {
                int rows = 1;
                int current = 0;
                for (int j = 2; j < S.length; j++) {
                    if (S[j].length() * i > x) {
                        continue loop2;
                    }
                    if (current != 0) {
                        current += i;
                    }
                    if (current + S[j].length() * i > x) {
                        rows++;
                        current = S[j].length() * i;
                    } else {
                        current += S[j].length() * i;
                    }
                }
                if (rows * i <= y) {
                    System.out.println("Case #" + m + ": " + i);
                    bw.write("Case # " + m + ": " + i);
                    bw.newLine();
                    continue loop;
                }
            }
            System.out.println("Case #" + m + ": 0");
        }
        fr.close();
        bw.close();
    }
}
