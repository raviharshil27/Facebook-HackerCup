/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package round_1;

/**
 *
 * @author Harshil
 * 
 * 5
EHT 34
ABCEFKO 4296473
ACEHKMPRTU 4125383079316
CDEGHIKLOSUWY 8333092520403744490
ADEFHNOPSUVY 3365973428406169086
* 
* Case #1: THE
Case #2: FACEBOOK
Case #3: HACKERCUPTEAM
Case #4: WISHESYOUGOODLUCK
Case #5: ANDHOPESYOUHAVEFUN
 */
public class bigtest
{
    
    private static String input="EHT";
    private static long numberToFind=new Long("34");
    private static int base = input.length();
    public static long power(int base,int i)
    {
        long answer=1L;
        long q=1L;
        for(int z=0;z<=i;z++)
            answer =answer * (long)base*q;
               
        return answer;
    }
    public  static void main(String args[])
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
      System.out.println("answer=>" + ansInString + " size"+ ansInString.length());
      System.out.println("answerBaase 10=>" + ansInBase10 );
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
          System.out.print(z);
         label.append(input.charAt(z));
          
        
      }
      System.out.println("\n" +label+ " size" + label.length());
  //    System.out.println(7612224527121966080-7612224527121966442);
//      baseToString(ansInString);
    }
    
}
