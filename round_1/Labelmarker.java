/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package round_1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Harshil
 */
public class Labelmarker 
{
      public static void main(String args[]) throws FileNotFoundException, IOException
    {
    
          BufferedReader br = new BufferedReader(new FileReader(new File("F:\\Facebook_Hacker_Cup\\Hacker_Cup_2014\\Round-1\\labelmaker.txt")));
          BufferedWriter bw = new BufferedWriter(new FileWriter(new File("F:\\Facebook_Hacker_Cup\\Hacker_Cup_2014\\Round-1\\labelmaker_output.txt")));
          int numberOfCase = Integer.parseInt(br.readLine());
          String currentLine[] = new String[2];
          String input;
          long numberToFind ;
          int base ;
          StringBuffer output= new StringBuffer();
          for(int z =0 ; z<numberOfCase;z++)
          {
              currentLine = br.readLine().split(" ");
              input = currentLine[0];
              numberToFind =Long.parseLong(currentLine[1]);
              base = input.length();
              output.append("Case #"+(z+1) + ": ");
              output.append(findSolution(input,numberToFind,base) + "\n");
                      
          }
              System.out.println(output);
          bw.write(output.toString());
          br.close();
          bw.close();
          

   
    }
       public static long power(int base,int i)
    {
        long answer=1L;
        long q=1L;
        for(int z=0;z<=i;z++)
            answer =answer * (long)base*q;
               
        return answer;
    }
    public static StringBuffer findSolution(String input,long numberToFind,int base)
     {
        long temp=0L;
        int i=0;
        long minNumber=0L,ansInBase10=0L;
      while(temp<numberToFind && temp >= 0)
      {
          temp += power(base,i);
          
          if(temp>numberToFind || temp <0)
              break;
          minNumber = temp;
          i++;

      }
      ansInBase10 =  (numberToFind - minNumber)-1;
      String ansInString = Long.toString(ansInBase10, base);
      StringBuffer label = new StringBuffer();
//      System.out.println("answer=>" + ansInString + " size"+ ansInString.length());
//      System.out.println("answerBaase 10=>" + ansInBase10 );
        int z;
        
        while((ansInString.length()-i-1) != 0)
        {
            
                
                label.append(input.charAt(0));
                i--;
                       
           
        }
      
       // ansInString = "b59429c8a38817a06";
      for(int j=0;j<ansInString.length();j++)
      {
          char a = ansInString.charAt(j);
        
          if ((int) a >90)
              z=((int)a -87);
          else
               z = (int)a-48;
//          System.out.print(z);
         label.append(input.charAt(z));
          
        
      }
//      System.out.println("\n" +label+ " size" + label.length());
      return label;

    }
}
