import lombok.AllArgsConstructor;
import org.instancio.Instancio;
import org.instancio.InstancioClassApi;

import static org.instancio.Select.field;

@AllArgsConstructor
public class EasyInstancio<T> {
    private InstancioClassApi<T> instancioClassApi;
    private Class<T> clazz;

    public static <T> EasyInstancio<T> of(Class<T> clazz) {
        return new EasyInstancio<>(Instancio.of(clazz), clazz);
    }

    public EasyInstancio<T> set(String fieldName, Object value) {
        instancioClassApi.set(field(clazz, fieldName), value);
        return this;
    }

    public T create() {
        return instancioClassApi.create();
    }
}
