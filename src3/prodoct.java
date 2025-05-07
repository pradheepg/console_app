public class prodoct {
    private String name;
    private int id;
    private int quan;
    prodoct(String name,int id){
        this.name = name;
        this.id = id;
    }
    public int get_quan(){
        return quan;
    }
    public int getId() {
        return id;
    }
    public String get_name(){
        return name;
    }
    public void set_quan(int quan){
        this.quan = quan;
    }
}
