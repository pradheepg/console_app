import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Welcome to Student management Console:");
        Scanner sc = new Scanner(System.in);
        handels hand = new handels();
        while(true){
            System.out.println("--------------------------------------------");
            System.out.println("1.Add new student: ");
            System.out.println("2.Remove student: ");
            System.out.println("3.Search student: ");
            System.out.println("4.Display all student: ");
            System.out.println("5.Exit:!!!!");
            System.out.println("Enter You Choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    hand.add_student();
                    break;
                case 2:
                    System.out.println("Enter the id of student need to remove: ");
                    int temp = sc.nextInt();
                    hand.remove_student(temp);
                    break;
                case 3:
                    System.out.println("Enter the id of student need to Search: ");
                    int search = sc.nextInt();
                    hand.search_student(search);
                    break;
                case 4:
                    hand.display_all_student();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Enter correct input:(example:1,2,3,4,5");
            }
        }

    }
}
