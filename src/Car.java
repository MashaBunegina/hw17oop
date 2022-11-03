import java.time.LocalDate;

public class Car extends Transport {
    private String brand;
    private String model;
    double engineVolume;
    String colour;
    private int productionYear;
    private String productionCountry;
    String transmission;
    private String bodyType;
    String registrationNumber;
    private int numberOfSeats;
    public boolean summerTyres;
    private Insurance insurance;
    private Key key;

    public Car(String brand, String model, double engineVolume, String colour, int productionYear, String productionCountry, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerTyres, double speed) {
        super(brand, model, engineVolume, colour, productionYear, productionCountry, transmission, bodyType, registrationNumber, numberOfSeats, summerTyres, speed);
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume >= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (colour == null && colour == "") {
            this.colour = "белый";
        } else {
            this.colour = colour;
        }
        if (productionYear > 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (transmission == null || transmission.isEmpty()) {
            this.transmission = "механика";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty()) {
            this.bodyType = "default";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null) {
            this.registrationNumber = "x000x000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats >= 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (key == null) {

            this.key = new Insurance(2111.0, 20, "ОООхООО");
        } else {
            this.key = key;
        }
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public void car() {
        System.out.println(brand + model + ",  " + productionYear + " год выпуска, сборка в " + productionCountry + ", цвет " + colour + ", " + "объем двигателя - " + engineVolume + " л.");
    }

    public void refill() {
        System.out.println("можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");

    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public static class Insurance {
        private LocalDate validityPeriod;
        private double cost;
        private String number;

        public LocalDate getValidityPeriod() {
            return validityPeriod;
        }

        public String getNumber() {
            return number;
        }

        public double getCost() {
            return cost;
        }

        public Insurance(LocalDate validityPeriod, double cost, String number) {
            if (validityPeriod == null) {
                validityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.validityPeriod = validityPeriod;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }


        }
    }
        private static class Key {
            private final boolean remoteEngineStart;
            private final boolean keylessAccess;

            public Key(boolean remoteEngineStart, boolean keylessAccess) {
                this.remoteEngineStart = remoteEngineStart;
                this.keylessAccess = keylessAccess;
            }

            public Key() {
                this(false, false);
            }

            public boolean getRemoteEngineStart() {
                return remoteEngineStart;
            }


            public boolean getKeylessAccess() {
                return keylessAccess;
            }
        }
    }

}
