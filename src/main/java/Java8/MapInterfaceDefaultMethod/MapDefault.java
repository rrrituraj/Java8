package Java8.MapInterfaceDefaultMethod;

import java.util.HashMap;
import java.util.Map;

public class MapDefault {
    public static void main(String[] args) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        integerMap.put(2, 3);
        integerMap.put(3, 3);
        integerMap.put(4, 2);
        integerMap.forEach(MapDefault::printMap);
        integerMap.replaceAll((k, v) -> (int) Math.pow(k, v));
        integerMap.forEach(MapDefault::printMap);


    }

    private static void printMap(Integer k, Integer v) {
        System.out.println(k + "\t" + v);
    }
}
