public class Lasagna {
    private int expectedMinutesInOven = 40;

    public int expectedMinutesInOven() {
        return this.expectedMinutesInOven;    
    }

    public int remainingMinutesInOven(int time) {
        return expectedMinutesInOven() - time;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int time) {
        return preparationTimeInMinutes(layers) + time;
    }
}
