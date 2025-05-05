import java.util.ArrayList;
import java.util.Scanner;

public class handels {
    private ArrayList<student> student_list;
    handels(){
        student_list = new ArrayList<>();
    }
    private void display_student(student students){
        System.out.println("----------------------------------------");
        System.out.println("Name: "+students.get_name());
        System.out.println("RollNumber: "+students.get_rollno());
        System.out.println("Id: "+students.get_id());
        System.out.println("Mark: "+students.get_mark());
    }

    public void display_all_student(){
        for(student students : student_list){
            this.display_student(students);
        }
    }


    public void search_student(int id){
        for(student students : student_list){
            if(id == students.get_id()){
                this.display_student(students);
                break;
            }
        }
    }

    public void remove_student(int id){
        for(student students : student_list){
            if(id == students.get_id()){
                student_list.remove(students);
                break;
            }
        }
    }

    public void add_student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String temp_name = sc.next();
        System.out.println("Enter the Rollnumer: ");
        String temp_Rollnumber = sc.next();
        System.out.println("Enter Id: ");
        int temp_id = sc.nextInt();
        while (this.check_id(temp_id)){
            System.out.println("THis is is taken, Enter different id: ");
            temp_id = sc.nextInt();
        }
        System.out.println("Enter the mark if the student has any: (note:If not ,Enter 0!!) :");
        int mark = sc.nextInt();
        student temp = new student(temp_name,temp_Rollnumber,temp_id);
        temp.set_mark(mark);
        student_list.add(temp);


    }

    private Boolean check_id(int id){
        for(student students : student_list){
            if (students.get_id() == id){
                return true;
            }
        }
        return false;
    }

}
