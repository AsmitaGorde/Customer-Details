package Application4;

import java.util.Scanner;

public class MainApp {
  static   Scanner sc= new Scanner(System.in);
   static Customer customer;
    static  boolean status=true;
  static   BLclass b= new BLclass();


    public static void main(String[] args) {
        do {

            System.out.println("1.Buy Product");
            System.out.println("2.cancel Product");
            System.out.println("3.display all Product");
            System.out.println("4.sign out");
            System.out.println("5.exit");


            int ch = sc.nextInt();

            if (customer==null){

                customer=login();

            }

            switch (ch) {

                case 1:
                    buyProduct();
                    break;
                case 2:
                    cancleProduct();
                    break;
                case 3:
                    displayProduct();

                    break;
                case 4:
                   customer=null;
                    break;
                case 5:
                    signOut();
                    break;

                default:
                    System.out.println("invalid choice");


            }


        } while (status);
    }

    private static void signOut() {
        status=false;

    }

    private static void displayProduct() {
        b.displayAllProducts();
        System.out.println("display Product");
    }

    private static void cancleProduct() {
        System.out.println("enter productName");
        String pname=sc.next();
        b.cancelProduct(pname );
        System.out.println("cancel product");
    }

    private static void buyProduct() {
        System.out.println("enter pname");
        String pname=sc.next();
        System.out.println("enter price");
        double price=sc.nextDouble();

        b.buyProduct(pname,price);

        System.out.println("buy Product");
    }

    private static Customer login() {
        System.out.println("enter username");
        String username=sc.next();
        System.out.println("enter password");
        String password=sc.next();
        System.out.println("login successfully");
       Customer c= new Customer(username,password);
       b.addCustomer(c);
       return c;

    }

}
