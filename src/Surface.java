import java.util.List;

public abstract class Surface {

    Material material;

    public Surface(Material material) {
        this.material = material;
    };

    public abstract List<Point> get_intersections();

}

