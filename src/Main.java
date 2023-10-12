public class Main {
    public static void main(String[] args) {
        //Just a pancake
        Pancake pancake = new JustPancake();
        System.out.println("Price of the pancake " + pancake.price());
        System.out.println(pancake.description());
        System.out.println("It took " + pancake.time() + " minutes to cooked");

        //Pancake with syrop
        pancake = new PancakeWithSyrop(pancake);
        System.out.println("Price of the pancake " + pancake.price());
        System.out.println(pancake.description());
        System.out.println("It took " + pancake.time() + " minutes to cooked");

        //Chocolate pancake
        pancake = new ChocolatePancake(pancake);
        System.out.println("Price of the pancake " + pancake.price());
        System.out.println(pancake.description());
        System.out.println("It took " + pancake.time() + " minutes to cooked");
    }
}