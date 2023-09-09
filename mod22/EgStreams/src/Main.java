import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> streamStr = List.of("Max","Teste").stream();

        Stream<String> streamSet = Set.of("Max","Teste").stream();

        Map<String,String> map = Map.of("Max","Back","Maria","Front");
        Stream<String> streamMapKey = map.keySet().stream();
        Stream<String> streamMapValue = map.values().stream();
    }
}
