package Lesson8HWCake;

public class TasteTester {

    public static void main(String[] args) {

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setCandles(30);
        birthdayCake.setTasty("Cherry");
        birthdayCake.setPrice(300);

        System.out.println("Birthday CAke: ");
        System.out.println(birthdayCake.getTasty());
        System.out.println(birthdayCake.getPrice());
        System.out.println(birthdayCake.getCandles());


        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setLevels(3);
        weddingCake.setTasty("Vanilla");
        weddingCake.setPrice(1000);

        System.out.println("Wedding CAke: ");
        System.out.println(weddingCake.getTasty());
        System.out.println(weddingCake.getPrice());
        System.out.println(weddingCake.getLevels());


    }
}
