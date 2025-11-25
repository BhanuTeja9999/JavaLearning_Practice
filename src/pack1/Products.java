package pack1;

public class Products {

	    String ProductName;
	    int ProductID;
	    String ProductBrand;
	    
	    static String soldby = "D-mart";
	    
	    Products(String name,int id,String brand)
	    {
	    	ProductName = name;
	    	ProductID = id;
	    	ProductBrand=brand;   	
	    }
	    public static void main(String[] args)
	    {
			Products p1=new Products("Biscuits",888,"Britannia");
			Products p2=new Products("Slippers",889,"Paragon");
			Products p3=new Products("Shirt",890,"Calvin");
			
			System.out.println("----------------------------");
			System.out.println("p1: "+p1.ProductName+" "+p1.ProductID+" "+p1.ProductBrand);
			System.out.println("p2: "+p2.ProductName+" "+p2.ProductID+" "+p2.ProductBrand);
			System.out.println("p3: "+p3.ProductName+" "+p3.ProductID+" "+p3.ProductBrand);
			
			System.out.println("--------------------------------");
			System.out.println("soldby: "+soldby);
			soldby = "Reliance";
			
			System.out.println("\np1: "+p1.ProductName+" "+p1.ProductID+" "+p1.ProductBrand+" "+Products.soldby);
			System.out.println("p2: "+p2.ProductName+" "+p2.ProductID+" "+p2.ProductBrand+" "+Products.soldby);
			System.out.println("p3: "+p3.ProductName+" "+p3.ProductID+" "+p3.ProductBrand+" "+Products.soldby);
			
			
		}
	}

