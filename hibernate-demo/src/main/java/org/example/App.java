package org.example;
import java.util.List;

import org.example.model.Inventory;
import org.example.service.InventoryService;
import org.example.service.InventoryServiceImpl;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	    	  
			
			InventoryService service=new InventoryServiceImpl(); 
		/*	Inventory i=service.createInventory(new Inventory(301, 101, "Laptop", 10));
					 * System.out.println(i);
					 */
		    	  
		    	  List<Inventory> i=service.getAllInventory();
		    	  for(Inventory ii:i)
		    	  {
		    		  System.out.println(i);
		    	  }

				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
	}

}
