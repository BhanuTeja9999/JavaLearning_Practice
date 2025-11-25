package pack1;

public class Task30 
{
    String[] meth1(int arr1[],char arr2[])
    {
    	int RCpy[]=new int[arr1.length];
    
    	   for(int j=0,i=arr1.length-1;j<=RCpy.length-1;j++,i--)
    	   {
    		   RCpy[j]=arr1[i];
    	   }
    	   
    	   
       	System.out.println("\nPrinting elements present in the arr1 array :");

    		for(int i=0;i<=arr1.length-1;i++)
        	{
        		System.out.print(arr1[i] + " ");
        	}  
	
    	System.out.println("\nPrinting elements present in the RCpy array :");
    	for(int i=0;i<=RCpy.length-1;i++)
    	{
    		System.out.print(RCpy[i] + " ");
    	}
    	
       	System.out.println("\nPrinting elements present in the arr2 array in forward direction :");

    	for(int i=0;i<=arr2.length-1;i++)
    	{
    		System.out.print(arr2[i] + " ");
    	}  
    	
    	
     	System.out.println("\nPrinting elements present in the arr2 array in backward direction :");

    	for(int i=arr2.length-1;i>=0;i--)
    	{
    		System.out.print(arr2[i] + " ");
    	} 
     	System.out.println("\nPrinting elements present in the arr2 array using for each loop :");
     	for(int ele:arr2)
     	{
     		System.out.print((char)ele + " ");
     	}
    	return new String[] {"Bhanu","Hari","Santosh","SriRam","Kasyap"};
    }
    
    public static void main(String[] args) {
    	String[] sarr=new Task30().meth1(new int[]{1,2,3,4,5},new char[]{'A','B','C','D','E'} );
    	System.out.println();
    	if(sarr.length>=2)
    	{
    		if(sarr.length%2==0)
    		{
    			for(int e=0;e<=(sarr.length-1)/2;e++)
    				System.out.print(sarr[e]+ " ");
    		}
    		else
    		{
    			System.out.println("\nPrinting last two elements of the array");
    			System.out.print(sarr[sarr.length-2]+" "+sarr[sarr.length-1]);
    		}
    	}
	
	}
}
