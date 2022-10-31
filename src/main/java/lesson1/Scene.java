package lesson1;

import java.util.List;

public class Scene {
    private int id;
    private List<Model> models;
    private List<Flash> flashes;

    public Scene(int id, List<Model> models, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
