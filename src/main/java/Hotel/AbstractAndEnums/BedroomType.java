package Hotel.AbstractAndEnums;

public enum BedroomType {
    BRONZE("Bronze", 1, 30),
    SILVER("Silver", 2, 50),
    GOLD("Gold", 4, 80),
    PLATINUM("Platinum", 6, 120);

    private String humanReadable;
    private int capacity;
    private int rate;
    BedroomType(String humanReadable, int capacity, int rate) {
        this.humanReadable = humanReadable;
        this.capacity = capacity;
        this.rate = rate;
    }

    public String getHumanReadable() {
        return humanReadable;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getRate() {
        return rate;
    }
}
