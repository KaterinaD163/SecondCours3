public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        if (brand == "" && model == "" && productionCountry == "") {
            System.out.println("default");
        }
        if (engineVolume == 0) {
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + " 1,5 л, "
                    + this.color + ", год выпуска - " + this.productionYear + ", " + this.productionCountry);
        }
        if (color == "") {
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, "
                    + "цвет кузова - белый, " + "год выпуска - " + this.productionYear + ", " + this.productionCountry);
        }
        if (productionYear == 0) {
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, "
                    + this.color + ", " + "год выпуска - 2000 " + ", " + this.productionCountry);
        }
        if (engineVolume != 0 && color != "" && productionYear != 0)
            System.out.println(this.brand + " " + this.model + ": объём двигателя " + this.engineVolume +
                    " л, " + this.color + ", год выпуска - " + this.productionYear + ", " + this.productionCountry);
    }


    public String toString() {
        return this.brand + " " + this.model + ": объём двигателя " + this.engineVolume + " л, " + this.color + ", год выпуска - " + this.productionYear + ", " + this.productionCountry;
    }
}


