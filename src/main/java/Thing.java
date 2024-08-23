import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Thing {
    String shape;
    String color;

    public String toJSON() {
        return "{ \"shape\": \"" + shape + "\", \"color\": \"" + color + "\" }";
    }
}
