package com.talentech.app;

public class workingWithArrays {
	
	public void reverseArray(){
		int myArray[] = {2,5,3,8,6,9};
		int aLen = myArray.length;
		
		for (int i=0; i<aLen/2; i++){
			int temp = myArray[i];
			myArray[i] = myArray[aLen-1-i];
			myArray[aLen-1-i] = temp;
		}//end of For
		
		for (int c=0;c<aLen;c++){
			System.out.println(myArray[c]);
		}
	}

}
