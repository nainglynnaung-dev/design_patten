package adapter;

public class Main6 {
    static void main() {
        IRemote i=new ModernTv(new OldTv());
        i.off();
        i.on();
    }
}
