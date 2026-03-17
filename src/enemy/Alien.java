package enemy;

public class Alien implements Enemy {

    public Alien() {}

    @Override
    public void attack() {
        System.out.println("Alien attacks");
    }
}