package singleton;

public class Main2 {

    public static void main(String[] args) {
        Employee e1=new Employee();

        Employee e2=e1.getInstance();
        Employee e3=e2.getInstance();

        boolean flag=e2 == e3;
        System.out.println(flag + "e2 and e3");
    }


}
