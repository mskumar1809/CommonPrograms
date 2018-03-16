package essentials;

import java.util.HashSet;

public class DuplicatesInArray 
{   
    public static void main(String[] args) 
    {
    	
    		int [] intArray = { 4, 5, 5, 6, 3, 4, 6, 16};
        //String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
 
        HashSet<Integer> set = new HashSet<Integer>();
 
        for (int arrayElement : intArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
    }    
}