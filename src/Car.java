public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == "" || brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == "" || model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == "" || color == null) {
            this.color = "белого";
        } else {
            this.color = color;
        }

        if (country == "" || country == null) {
            this.country = "default";
        } else {
            this.country = country;
        }

        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + year + " год выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя " + engineVolume + " л.";
    }

}
