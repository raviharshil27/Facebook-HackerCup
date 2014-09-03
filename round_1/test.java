/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package round_1;

/**
 *
 * @author Harshil
 */
public class test
{
    private static String input="ACEHKMPRTU ";
    private static int numberToFind =23;
    private static int base = input.length();
    public  static void main(String args[])
    {
        int temp=0,i=0;
        int minNumber=0,ansInBase10=0;
      while(temp<numberToFind)
      {
          temp += Math.pow(base, i);
          i++;
          if(temp<numberToFind)
              minNumber = temp;
          
      }
      ansInBase10 = numberToFind - minNumber;
      String ansInString = Integer.toString(ansInBase10, base);
      StringBuffer label = new StringBuffer();
      System.out.println("answer" + ansInString + " size"+ ansInString.length());
      
      for(int j=0;j<ansInString.length();j++)
      {
          char a = ansInString.charAt(j);
          int z = (int)a-48;
         label.append(input.charAt(z));
         // System.out.println(z);
        
      }
      System.out.println(label);
//      baseToString(ansInString);
    }
    
}
