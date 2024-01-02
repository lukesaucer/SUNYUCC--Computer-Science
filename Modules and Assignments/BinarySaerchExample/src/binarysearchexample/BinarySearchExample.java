package binarysearchexample;

class BinarySearchExample{  
	
	 /** Method binarySerach finds the first occurence
	  * of int key in array arr[]*/
	
	 public static void binarySearch(int arr[], int first, int last, int key){  
	   int mid = (first + last)/2;  
	   while( first <= last ){  
	      if ( arr[mid] < key ){  
	        first = mid + 1;     
	      }else if ( arr[mid] == key ){  
	        System.out.println("Element is found at index: " + mid);  
	        break;  
	      }else{  
	         last = mid - 1;  
	      }  
	      mid = (first + last)/2;  
	   }  
	   if ( first > last ){  
	      System.out.println("Element is not found!");  
	   }  
	 }  
	 
	 public static void main(String args[]){  
	        int array[] = {1,2,3,4,5,6,7,8};  
	        int key = 3;  
	        int last=array.length-1;  
	        binarySearch(array,0,last,key);     
	 }  
	}  