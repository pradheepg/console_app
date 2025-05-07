import java.util.Scanner;

class Main3{
    public static void main(String[] arg){
        System.out.println("Welcome to Inventory system");
        handles hh = new handles();
        Scanner sccc = new Scanner(System.in);
        int chh = 0;
        while(true){
            System.out.println("1.Add new product: ");
            System.out.println("2.Display all product: ");
            System.out.println("3.Update stock quantity; ");
            System.out.println("4.Search product: ");
            System.out.println("5. Exit");
            chh = sccc.nextInt();
            switch (chh){
                case 1:
                    hh.add_prodect();
                    System.out.println("thattttttt");
                    break;
                case 2:
                    hh.display_all();
                    break;
                case 3:
                    hh.set_q();
                    break;
                case 4:
                    System.out.println("Enter the product Id: ");
                    int temp = sccc.nextInt();
                    hh.search(temp);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    sccc.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}