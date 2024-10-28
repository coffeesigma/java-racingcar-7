package racingcar.model;

public class CarModel {
    private static final int START_POSITION = 0;

    private String carName;
    private int position = START_POSITION;

    public CarModel(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
