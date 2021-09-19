package com.gretalearning.main;
import java.util.Scanner;

 class MergeSortImplementation {
	void merge(int arr[], int left, int mid, int right) {
		// Find sizes of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create temporary arrays */
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		/* Copy data to temporary arrays */
		for (int i = 0; i < n1; ++i)
			leftArray[i] = arr[left + i];
		for (int j = 0; j < n2; ++j)
			rightArray[j] = arr[mid + 1 + j];

		/* Merge the temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
		
	}
	

	// Main function that sorts array[left...right] using merge()
 void sort(int[] notes, int left, int right)
	{
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves
			sort(notes, left, mid);
			sort(notes, mid + 1, right);

			// Merge the sorted halves
			merge(notes, left, mid, right);
			
		}

	}
}


public class Denominations {
	public static void main(String[]args) 
  {
	Scanner sc =new Scanner(System.in);
	MergeSortImplementation ms=new MergeSortImplementation();
	System.out.println("Enter the number of Denominations");
    int N=sc.nextInt();
    int notes[]=new int[N];
    int notescount[]=new int[N];
    
    System.out.println("Enter the Denominations ");
    for(int i=0;i<N;i++) 
    {
    	notes[i]=sc.nextInt();
    }
    
    //mergsort and print sorted denomination
    
    ms.sort(notes,0,notes.length-1);
    for(int l=0;l<notes.length;l++) 
    {
    	System.out.println(" "+notes[l]);
    }
    
    int amt;
    System.out.println("Enter the amount to be paid ");
    amt=sc.nextInt();
    
    int totalNotes=0;
    
    for(int i=0;i<N;i++) 
    {
    	  notescount[i]=amt/notes[i];
    	 
    	  
    	  amt=amt-notes[i]*notescount[i];
    	  totalNotes=totalNotes+notescount[i];
    	  
    }
    if(amt==0)
    {
      System.out.println("Total number of notes payble "+totalNotes );
      System.out.println("Amount payble in denominations of:-" ); 
      for(int i=0;i<N;i++)
      {
       System.out.println(notes[i]+ ":" +notescount[i] );
      }
    }
  if(amt!=0) 
  {
	  System.out.println("Amount not payble" );  
  }
    
  }
}
