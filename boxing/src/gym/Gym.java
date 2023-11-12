package gym;

import java.util.ArrayList;
import java.util.List;

public class Gym {
    List<Boxer> boxers;
    Trainer trainer;

    public Gym(Trainer trainer) {
        this.boxers=new ArrayList<>();
        this.trainer=trainer;
    }
    public Gym(){

    }

    public Boxer getBoxers(int number) {
        return boxers.get(number);
    }

    public void setBoxers(Boxer boxer) {
        this.boxers.add(boxer);
    }
}
