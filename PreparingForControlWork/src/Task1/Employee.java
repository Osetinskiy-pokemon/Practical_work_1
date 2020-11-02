package Task1;

public abstract class Employee {
    private int id; //идентификатор
    private String name; //имя

    public void  setId(int id){ this.id = id;}
    public int getId(){ return id;}

    public void setName(String name){ this.name = name;}
    public String getName(){ return name;}

    public abstract double calculationSalary();
}

