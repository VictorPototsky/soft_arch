package lesson1;

import java.util.List;

public class Model {
    private List<Poligon> poligons;
    private List<Texture> textures;

    public Model(List<Poligon> poligons, List<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }
}
