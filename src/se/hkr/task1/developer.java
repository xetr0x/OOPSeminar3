package se.hkr.task1;

public class developer extends employee {
    private String technology;
    public developer(int id, String name, String dept, Double salary,String technology ) {
        super(id, name, dept, salary);
        this.technology = technology;
    }
    String gettechnology() {
        return technology;
    }
    void settechnology(){}

    @Override
    void work(){
        System.out.println(technology);
    }
}
