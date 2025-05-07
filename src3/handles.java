import java.util.ArrayList;
import java.util.Scanner;

public class handles {
    private ArrayList<prodoct> prodocts = new ArrayList<>();

    private Boolean id_excit(int id){
        for(prodoct prodoctt : prodocts) {
            if (prodoctt.getId() == id) {
                return true;
            }
        }
            return false;
    }

    public void add_prodect(){
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter Product name: ");
        String temp_name = cc.next();
        System.out.println("Enter Product id: (Note:it should be unic!!): ");
        int temp_id = cc.nextInt();
        while (this.id_excit(temp_id)){
            System.out.println("Id already exicts ,pls enter again: ");
            temp_id = cc.nextInt();
        }
        prodoct temp_pro = new prodoct(temp_name,temp_id);
        System.out.println("Enter the quantity: ");
        int temp_quan = cc.nextInt();
        temp_pro.set_quan(temp_quan);
        prodocts.add(temp_pro);
        System.out.println("This");
    }

    public void set_q(){
        Scanner cc = new Scanner(System.in);
        System.out.println("Enter Id: ");
        int id = cc.nextInt();
        System.out.println("Enter quantity: ");
        int temp_q = cc.nextInt();
        for(prodoct prodoctt : prodocts) {
            if(id == prodoctt.getId()) {
                prodoctt.set_quan(temp_q);
            }
        }
    }

    public void display_all(){
        System.out.println("Product list: ");
        for(prodoct prodoctt : prodocts) {
           this.print_product(prodoctt);
        }
    }

    private void print_product(prodoct pp){
        System.out.println("-----------_-------------");
        System.out.println("Name: "+pp.get_name());
        System.out.println("Id: "+pp.getId());
        System.out.println("quan: "+pp.get_quan());
    }


    public void search(int id){
        for(prodoct prodoctt : prodocts) {
            if(id == prodoctt.getId()) {
                this.print_product(prodoctt);
            }
            }
        }

}
