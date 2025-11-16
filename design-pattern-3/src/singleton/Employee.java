package singleton;

public class Employee {

    public Employee instance;


    public Employee getInstance(){
        if(instance == null){
                instance=new Employee();

        }
        return instance;

    }
}
