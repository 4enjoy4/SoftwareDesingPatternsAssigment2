//The decorator for pancake
public class PancakeWithSyrop implements Pancake {
    private final Pancake pancake;

    public PancakeWithSyrop(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public int price() {//adding extra price
        return pancake.price() + 2;
    }

    @Override
    public String description() {//adding extra description
        return pancake.description() + "With syrop";
    }

    @Override
    public int time() {//adding extra time
        return pancake.time() + 1;
    }
}
