//The decorator for pancake
public class ChocolatePancake implements Pancake{
    private final Pancake pancake;

    public ChocolatePancake(Pancake pancake) {
        this.pancake = pancake;
    }

    @Override
    public int price() {//adding extra price
        return pancake.price() + 5;
    }

    @Override
    public String description() {//adding extra description
        return pancake.description() + "with chocolate";
    }

    @Override
    public int time() {//adding extra time
        return pancake.time() + 5;
    }
}
