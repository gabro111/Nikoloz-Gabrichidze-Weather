package ge.btu.nika.api.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Weather {
    private String name;
    private double temperature;
    private double humidity;
    private double pressure;
    private DirectionType direction;
    private double speed;

    public Weather(String name, double temperature, double humidity, double pressure, DirectionType direction, double speed) {
        this.name = name;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.direction = direction;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public DirectionType getDirection() {
        return direction;
    }

    public void setDirection(DirectionType direction) {
        this.direction = direction;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "name='" + name + '\'' +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", direction=" + direction +
                ", speed=" + speed +
                '}';
    }
}
