package lesson1;

import java.util.List;

public class ModelStore implements IModelChanger, IModelChangedObserver{
    private List<Model> models;
    private List<Scene> scenes;
    private List<Flash> flashes;
    private List<Camera> cameras;
    private IModelChangedObserver changeObserver;

    public ModelStore(List<Model> models, List<Scene> scenes, List<Flash> flashes, List<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene getScena(int sc_id, List<Scene> scenes) {
        Scene scene = null;
        /*

         */
        return scene;
    }
    public void applyUpdateModel(){}
    public void notifyChange(IModelChanger sender){}
}
