package com.talentech.app;

public class workingWithArrays {
	
	public void reverseArray(){
		int myArray[] = {2,5,3,8,6,9};
		int aLen = myArray.length;
		
		for (int j=0; j<aLen/2; j++){
			int temp = myArray[j];
			myArray[j] = myArray[aLen-1-j];
			myArray[aLen-1-j] = temp;
		}//end of For
		
		for (int c=0;c<aLen;c++){
			System.out.println(myArray[c]);
		}
	}

}
