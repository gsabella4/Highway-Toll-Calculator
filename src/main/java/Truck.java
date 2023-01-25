public class Truck implements Vehicle {

    public Truck(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    private int numberOfAxles;

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public double calculateToll(int distance){
        double toll = 0;
        if (numberOfAxles == 4){
            toll+= (distance * 0.040);
        }
        else if (numberOfAxles == 6){
            toll+= (distance * 0.045);
            }
        else if (numberOfAxles >= 8){
            toll+= (distance *0.048);
        }
        return toll;
    }

    public String toString(){
        return "Truck (" + numberOfAxles + " axles)";
    }
}
