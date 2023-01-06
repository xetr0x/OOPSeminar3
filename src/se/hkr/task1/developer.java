package se.hkr.task1;

public class developer extends Employee {
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
        super.work();
        System.out.println("Developer is developing" + technology);
    }

}
