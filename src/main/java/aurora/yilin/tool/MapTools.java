package aurora.yilin.tool;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;


/**
 * @author yilin
 * @className MapTools
 * @Description
 * @date 2021/6/22 19:43
 * @since 1.0.0
 **/
public class MapTools {
    /**
     * 根据value获取到map中的keys
     * @param map map对象
     * @param value 想要获取对应key的value值
     * @param <K> map结构中key的数据类型
     * @param <V> map结构中value的数据类型
     * @return 返回根据value获取到的key的Set集合
     */
    public static <K, V> Set<K> getKeysByStream(Map<K, V> map, V value) {
        return map.entrySet()
                .stream()
                .filter(kvEntry -> Objects.equals(kvEntry.getValue(), value))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}
