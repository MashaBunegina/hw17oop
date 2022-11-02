
public abstract class Transport {

    String brand;
    String model;
    private int productionYear;
    private String productionCountry;

    public Double speed;
    String finalStop;
    int numberOfWagons;
    String station;
    double priceOfTrip;
    int  numberOfStandingPlaces;

    public Transport(String brand, String model, double engineVolume, String colour, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerTyres, double speed) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (colour == null || colour.isEmpty()) {
            this.colour = "белый";
        } else {
            this.colour = colour;
        }
        this.speed = speed;
        if (speed == 0) {
            this.speed = 100.7;
        } else {
            this.speed = speed;
        }
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, double speed, double priceOfTrip, String station, String finalStop, int numberOfWagons) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "o";
        } else {
            this.model = model;
        }
        if (speed == 0) {
            this.speed = 100.7;
        } else {
            this.speed = speed;
        }
        if (productionYear < 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (station == null || station.isEmpty()) {
            this.station = "default";
        } else {
            this.station = station;
        }
        if (finalStop == null || finalStop.isEmpty()) {
            this.finalStop = "default";
        } else {
            this.finalStop = finalStop;
        }
        if (priceOfTrip < 0) {
            this.priceOfTrip = 2300;
        } else {
            this.priceOfTrip = priceOfTrip;
        }
        if (numberOfWagons < 0) {
            this.numberOfWagons = 23;
        } else {
            this.numberOfWagons = numberOfWagons;

        }
    }

    public Transport(String brand, String model, int productionYear, String productionCountry, double speed, double priceOfTrip, String station, String finalStop, int numberOfStandingPlaces, int numberOfBreakStops) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "o";
        } else {
            this.model = model;
        }
        if (speed == 0) {
            this.speed = 100.7;
        } else {
            this.speed = speed;
        }
        if (productionYear < 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (station == null || station.isEmpty()) {
            this.station = "default";
        } else {
            this.station = station;
        }
        if (finalStop == null || finalStop.isEmpty()) {
            this.finalStop = "default";
        } else {
            this.finalStop = finalStop;
        }
        if (priceOfTrip < 0) {
            this.priceOfTrip = 2300;
        } else {
            this.priceOfTrip = priceOfTrip;
        }
        if (numberOfWagons < 0) {
            this.numberOfWagons = 23;
        } else {
            this.numberOfWagons = numberOfWagons;

        }
    }

    public void Train (String brand, String model, int productionYear, String productionCountry, double speed, double priceOfTrip, String station, String finalStop, int numberOfStandingPlaces , int numberOfBreakStops) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "o";
        } else {
            this.model = model;
        }
        if (speed == 0) {
            this.speed = 100.7;
        } else {
            this.speed = speed;
        }
        if (productionYear < 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (station == null || station.isEmpty()) {
            this.station = "default";
        } else {
            this.station = station;
        }
        if (finalStop == null || finalStop.isEmpty()) {
            this.finalStop = "default";
        } else {
            this.finalStop = finalStop;
        }
        if (priceOfTrip < 0) {
            this.priceOfTrip = 2300;
        } else {
            this.priceOfTrip = priceOfTrip;
        }
        if (numberOfStandingPlaces < 0) {
            this.numberOfStandingPlaces = 23;
        } else {
            this.numberOfStandingPlaces = numberOfStandingPlaces;

        }
    }

    public void train() {
        System.out.println(" Поезд " + brand + " модель " + model + " " + productionYear + " года выпуска в " + productionCountry + " скорость передвижения — " + speed + " км/ч, отходит от " + station + " и следует до станции " + finalStop + ". Цена поездки —  " + priceOfTrip + " рублей, в поезде " + numberOfWagons + " вагонов");
    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }


    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public String getStation() {
        return station;
    }

    public double getPriceOfTrip() {
        return priceOfTrip;
    }

    public String colour;

    public String getColour() {
        return colour;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getSpeed() {
        return speed;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setPriceOfTrip(double priceOfTrip) {
        this.priceOfTrip = priceOfTrip;
    }

}




