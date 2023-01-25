public class Car implements Vehicle {
    private boolean hasTrailer;

    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public Car(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public double calculateToll(int distance) {
        double toll = 0.020 * distance;
        double trailerFee = 1.00;
        if (hasTrailer){
            return toll += trailerFee;
        }
        return toll;
    }

    public String toString(){
        if (hasTrailer){
            return "Car (with trailer)";
        } else {
            return "Car";
        }
    }
}
