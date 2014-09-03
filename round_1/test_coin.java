/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package round_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Harshil
 * 
 * 5
3 6 4
8 5 2
3 4 4
1 3 1
2 10 9
 */
public class test_coin
{
    private static int noOfJar=3,noOfCoins = 10,coinsToFetch= 9;
    private static List jarList= new ArrayList();
    public static void main(String args[])
    {
            fillTheJar();
           // sortJar();
            emptyJar();
            System.out.println(jarList);
    }
    public static void sortJar()
    {
       // Collections.sort(jarList);
    }
    public static void emptyJar()
    {
        int counter=0;
        for (int i=0;i <noOfJar;i++)
        {
            
        }
    }
    public static void fillTheJar()
    {
        int firstRoundCoin = noOfCoins/noOfJar;
        int totalCoinsToFillup = noOfCoins;
//First round coins adding....        
        for(int i =0;i<noOfJar;i++)
        {
            jarList.add(i,firstRoundCoin);
        }
//Reduce the value of totalcoinsToFillup
        totalCoinsToFillup -=(firstRoundCoin*noOfJar);
//Add the remaining coins...        
        int temp;
        for(int i=0;i<totalCoinsToFillup;i++)
        {
            temp = (int) jarList.get(i);
         //   jarList.remove(i);
            temp++;
         //   jarList.add(i, temp);
            jarList.set(i, temp);
        }
//Reduce the value of totalcoinsToFillup
     //   totalCoinsToFillup =0;
        
        System.out.println("The Arraylist"+ jarList);
        System.out.println("Remainingcoins tobe filledup.." + totalCoinsToFillup);
    }
    
    
}
