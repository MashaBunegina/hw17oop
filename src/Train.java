public class Train extends Transport {
    double priceOfTrip;

    public Train(String brand, String model,int productionYear, String productionCountry, double priceOfTrip, double travelTime, String station, String finalStop, int numberOfWagons) {
        super(brand, model,productionYear, productionCountry, priceOfTrip, travelTime, station, finalStop, numberOfWagons );
        this.priceOfTrip = priceOfTrip;
        this.travelTime = travelTime;
        this.station = station;
        this.finalStop = finalStop;
        this.numberOfWagons = numberOfWagons;
    }

    double travelTime;
    String station;

    public void setPriceOfTrip(double priceOfTrip) {
        this.priceOfTrip = priceOfTrip;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    String finalStop;
    int numberOfWagons;

    public  void  refill(){
        System.out.println("нужно заправлять дизелем");

    }


    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public String getStation() {
        return station;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

}


