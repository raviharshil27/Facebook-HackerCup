/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineRound;

import java.io.*;

/**
 *
 * @author Harshil
 */
public class SquareDetector_1 
{
     public static void main(String[] args) throws FileNotFoundException, IOException
    {
        
       
    BufferedReader br = new BufferedReader(new FileReader(new File("F:\\Facebook_Hacker_Cup\\Hacker_Cup_2014\\square_detector.txt")));
    BufferedWriter bw = new BufferedWriter(new FileWriter(new File("F:\\Facebook_Hacker_Cup\\Hacker_Cup_2014\\output.txt")));
    int counter=0,bigCounter=0;
    int lastrow=0,lastcolumn=0;
    String currentLine;
    int totalcase =Integer.parseInt(br.readLine());
    
    boolean ans = false;
    int i1 = 0,j1 = 0,i2,j2 = 0;
   
    for(int z =0 ; z<totalcase;z++)
    {
        i1=0;i2=0;j1=0;j2=0;ans=false;
        counter=0;bigCounter=0;
        int totalLines = Integer.parseInt(br.readLine());
    for(int i=0;i<totalLines;i++)
    {
        currentLine=br.readLine();
        for(int j=0;j<currentLine.length();j++)
        {
            if(currentLine.charAt(j) == '#' && counter == 0)
            {
                
                i1=i;j1=j;i2=i;
                j2=currentLine.lastIndexOf('#');
                ans = true;
            }
            if(currentLine.charAt(j) == '#' && i<i1 && j<j1 && j >j2 )
            {
                ans = false;
            }
            if(ans==true && i >= i1 && j>=j1 && j <= j2 )
            {
                
                if(currentLine.charAt(j) == '#')
                {
                      counter++;
                  
                }
              
            }
            if(currentLine.charAt(j) == '#')
            {
                lastrow = i;lastcolumn = j;
                bigCounter++;
            }
            
        }
    }
    if(counter == bigCounter && (lastrow-i1 == lastcolumn-j1 ) && ans == true && (Math.sqrt(counter) == (lastrow-i1+1)))
            {
                ans = true;
                
            }
    else
        ans = false;
    System.out.println(ans+ "_"+z+ "_"+ totalLines);
    if(ans == true)
        bw.write("Case #"+(z+1)+": YES"+ "\n");
    else if(ans== false)
        bw.write("Case #"+(z+1)+": NO"+ "\n");
          
    
        
    }
    bw.close();
    }
    
}
