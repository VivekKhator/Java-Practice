package Collection;

public class Employee {
    private int empId;
    private String name;
    private long salary;

    public Employee(int empId, String name, long salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public int getEmpId(){
        return this.empId;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public long getSalary(){
        return this.salary;
    }
    public void setSalary(long salary){
        this.salary = salary;
    }
}
