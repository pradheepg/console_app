public class student {
    private String name;
    private String rollno;
    private int ID;
    private int mark;
    student(String name,String rollno, int id){
        this.ID = id;
        this.name = name;
        this.rollno = rollno;
    }
    public void set_mark(int mark){
        this.mark = mark;
    }
    public String get_name(){
        return name;
    }
    public String get_rollno(){
        return rollno;
    }
    public int get_id(){
        return ID;
    }
    public int get_mark(){
        return mark;
    }
}
