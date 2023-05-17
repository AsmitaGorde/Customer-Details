package Application4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BLclass {
    private HashMap<String, Double> productMap = new HashMap<String, Double>();

    private  Map<String,String> data1= new HashMap<>();
    {
        data1.put("asmi","asmii");
    }




    public  void addCustomer(Customer c)
    {
        String endName = c.getUsername();
        String endPassword = c.getPassword();
      Set<String> names=data1.keySet();


     if (data1.isEmpty())
         data1.put(endName,endPassword);


      for (String n:names) {
          if (n.equals(c.getUsername()) && data1.get(n).equals(c.getPassword())) {
              System.out.println("login successfully.........");

          } else if (n.equals(endName) && !(data1.get(n).equals(endPassword))) {

              System.out.println("login successfully");

          }else
              data1.put(endName,endPassword);
      }


    }


    public void buyProduct(String productName, double productPrice) {
        productMap.put(productName, productPrice);
        System.out.println( productName);
    }

    public void cancelProduct(String productName) {
        if (productMap.containsKey(productName)) {
            productMap.remove(productName);
            System.out.println("Product canceled: " + productName);
        } else {
            System.out.println("Product not found");
        }
    }

    public void displayAllProducts() {
        for (String productName : productMap.keySet()) {
            System.out.println(productName + ": " + productMap.get(productName));
        }
    }
}





