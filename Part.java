import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Part {

    public static Collection<List<Object>> main(List<String> list) {

        Collection Rlist = Arrays.asList();

        Rlist = partition(list, 4);

        return Rlist;
    }

    private static  <T> Collection<List<T>> partition(List<T> list, int size) {
        final AtomicInteger counter = new AtomicInteger (0);
        return list.stream ()
                .collect (Collectors.groupingBy (it -> counter.getAndIncrement () / size))
                .values ();
    }
}