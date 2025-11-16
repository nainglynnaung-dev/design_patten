package factory;

public class ToyFactory extends ToyAbstraction{


    @Override
    IToy makeToy() {
        return new RobotToy();
    }
}
