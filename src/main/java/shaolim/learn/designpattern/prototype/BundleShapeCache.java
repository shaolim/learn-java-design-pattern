package shaolim.learn.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class BundleShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public void put(String key, Shape shape) {
        cache.put(key, shape);
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }
}
