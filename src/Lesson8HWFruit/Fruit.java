package Lesson8HWFruit;

public class Fruit {

    private int calories;
    private String apple;
    private String removeSeeds;
    private String nowPeelingBanana;
    private String nowPeelingRemoveSeedsOrange;
    private String nowPeelingRemoveSeedsLemons;

    protected int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    protected String getMakeJuice() {
        return apple;
    }

    public void setMakeJuice(String apple) {
        this.apple = apple;
    }

    public String getRemoveSeeds() {
        return removeSeeds;
    }

    public void setRemoveSeeds(String removeSeeds) {
        this.removeSeeds = removeSeeds;
    }

    public String getPeelingBanana() {
        return nowPeelingBanana;
    }

    public void setPeelingBanana(String nowPeelingBanana) {
        this.nowPeelingBanana = nowPeelingBanana;
    }

    public String getPeelingRemoveSeedsOrange() {
        return nowPeelingRemoveSeedsOrange;
    }

    public void setPeelingRemoveSeedsOrange(String nowPeelingRemoveSeedsOrange) {
        this.nowPeelingRemoveSeedsOrange = nowPeelingRemoveSeedsOrange;
    }

    public String getPeelingRemoveSeedsLemon() {
        return nowPeelingRemoveSeedsLemons;
    }

    public void setPeelingRemoveSeedsLemon(String nowPeelingRemoveSeedsLemons) {
        this.nowPeelingRemoveSeedsLemons = nowPeelingRemoveSeedsLemons;
    }
}

