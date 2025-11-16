package factory;

public class Main4 {
    public static void main(String[] args) {
        ToyAbstraction ta=new ToyFactory();
        IToy toy=ta.makeToy();
        System.out.println(toy.makeToy());
    }
}
