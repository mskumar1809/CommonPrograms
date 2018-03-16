package essentials;

import java.util.ArrayList;

public class ReplaceCharacterwithString {


	     public static void main(String []args){
	         String str1 = "stauvwamna";
	         char[] arr1 = str1.toCharArray();
	         ArrayList<String> result = new ArrayList<String>();
	         char str2 = 'X';
	         char chr = 'a';
	         for(int i=0;i<arr1.length;i++){
	             if(arr1[i]==chr){
	                  arr1[i]=str2;
	                  System.out.println(arr1[i]);
	             }else
	             System.out.println(arr1[i]);
	             
	             
	             
	             
	         }
	     }
	}

