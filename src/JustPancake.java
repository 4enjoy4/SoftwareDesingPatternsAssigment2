//Implements the base class
public class JustPancake implements Pancake{
    @Override
    public int price() {
        return 10;
    }

    @Override
    public String description() {
        return "It's just a pancake";
    }

    @Override
    public int time() {
        return 5;
    }
}
