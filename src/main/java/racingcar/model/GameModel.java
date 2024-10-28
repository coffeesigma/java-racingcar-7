package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class GameModel {
    private List<CarModel> carModels;

    public GameModel() {
        this.carModels = new ArrayList<>();
    }

    public List<CarModel> getCarModels() {
        return carModels;
    }

    public void addCarModel(CarModel carModel) {
        this.carModels.add(carModel);
    }
}
