package DSAPrac;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> det = new HashMap<>();
        det.put("name",12);
        det.put("hello",11);
        det.put("class",34);

        Set<String> keys = det.keySet();

        for (var x: keys) {
            System.out.println(det.get(x));
        }
        System.out.println(det.get("ram"));
        System.out.println(det.get("sdfd"));
        System.out.println("last");
    }
}
