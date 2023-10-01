package Data;

public class Avanza implements Car{
    @Override
    public void drive() {
        System.out.println("Drive Avanza");
    }

    @Override
    public int getTire() {
        return 4;
    }
}
