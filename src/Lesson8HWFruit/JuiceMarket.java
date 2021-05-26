package Lesson8HWFruit;

public class JuiceMarket {
    public static void main(String[] args) {

        Fruit apple = new Fruit();
        apple.setCalories(56);
        apple.setMakeJuice("Apple ");
        apple.setRemoveSeeds("Now removing seeds ");

        System.out.println(apple.getRemoveSeeds());
        System.out.println(apple.getCalories());
        System.out.println(apple.getMakeJuice());


        Fruit banana = new Fruit();
        banana.setCalories(89);
        banana.setMakeJuice("Banana");
        banana.setPeelingBanana("Now peeling banana ");

        System.out.println(banana.getPeelingBanana());
        System.out.println(banana.getCalories());
        System.out.println(banana.getMakeJuice());


        Fruit orange = new Fruit();
        orange.setCalories(32);
        orange.setMakeJuice("Orange");
        orange.setPeelingRemoveSeedsOrange("Now peeling and remove seeds from Orange ");

        System.out.println(orange.getPeelingRemoveSeedsOrange());
        System.out.println(orange.getCalories());
        System.out.println(orange.getMakeJuice());

        Fruit lemon = new Fruit();
        lemon.setCalories(32);
        lemon.setMakeJuice("Lemon");
        lemon.setPeelingRemoveSeedsLemon("Now peeling and remove seeds from Lemon ");

        System.out.println(lemon.getPeelingRemoveSeedsLemon());
        System.out.println(lemon.getCalories());
        System.out.println(lemon.getMakeJuice());
    }
}
