import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)  {
        String[] member = {"김정수", "김지혜", "김태홍", "박경희", "박준제", "안재원", "양기석", "왕경훈",
                "이세인", "이재명", "이태열", "이태웅", "정민균", "정준기", "채오성", "최영준", "최웅진", "허하나", "현수정"};

        List<String> list = Arrays.asList(member);
        Collections.shuffle(list);

        int count = 1;
        for (List l : Part.main(list)) {

            System.out.println("=============["+count +"조 당첨!!!!]=============");
            System.out.println(l);
            System.out.println();
            count++;

        }
        System.out.println("축하드립니다 싸우지마세요^^");
    }

}
