package com.gretalearning.main;
import java.util.Scanner;


public class Transactions
{
 public static void main(String[] args)
 {
 	Scanner sc =new Scanner(System.in);
 	System.out.println("Enter the size of Transactions array");
 	int t=sc.nextInt();
 	
 	int transaction[]=new int[t];
 	System.out.println("Enter the values of Transactions array");
	for(int i=0;i<t;i++)
	{
		transaction[i]=sc.nextInt();
	}
	
	 System.out.println("Enter the number of targets ");
	 int tar=sc.nextInt();
	 for(int k=0;k<tar;k++) 
	 {
    	System.out.println("Enter the amount of target ");
	    int tarvalue=sc.nextInt();
	
	    int sum=0;
	     for(int j=0;j<transaction.length;j++)
	     {
	      sum=sum+transaction[j];
	
	       if(sum>=tarvalue) 
	        {
	    	 System.out.println("Target achieved in "+(j+1)+" transactions ");
	    	 break;
	        }
	     }
     
	   if (tar==transaction.length-1&&sum<tarvalue)
	   {
		System.out.println("Target not achieved");
	   }
	}
  }
}
