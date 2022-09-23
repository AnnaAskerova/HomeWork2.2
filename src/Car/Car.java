package Car;

import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final int productionYear;
    private final String productionCountry;
    private final float engineVolume;

    public Car(String brand, String model, String color, int productionYear, String productionCountry, float engineVolume) {
        this.brand = Objects.requireNonNullElse(brand, "default");
        this.model = Objects.requireNonNullElse(model, "default");
        this.color = Objects.requireNonNullElse(color, "белый");
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        this.productionCountry = Objects.requireNonNullElse(productionCountry, "default");
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public Car(String brand, String model, String color, String productionCountry, float engineVolume) {
        this(brand, model, color, 2000, productionCountry, engineVolume);
    }

    public Car(String brand, String model, String color, int productionYear, String productionCountry) {
        this(brand, model, color, productionYear, productionCountry, 1.5f);
    }

    public Car(String brand, String model, String color, String productionCountry) {
        this(brand, model, color, 2000, productionCountry, 1.5f);
    }

    @Override
    public String toString() {
        return "Автомобиль " + brand + ' ' + model + ", цвет " + color + ", год выпуска " + productionYear +
                ", страна-производитель " + productionCountry + ", объем двигателя " + engineVolume + " л.";
    }
}
