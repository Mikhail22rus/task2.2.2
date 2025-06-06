package web.model;

public class Car {
    private String model;
    private int year;
    private String color;

    public String getModel() {
        return model;
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
