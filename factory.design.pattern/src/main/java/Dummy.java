import java.util.*;
import java.util.stream.Collectors;
public class Dummy {
	public static void main(String[] aa) {
		List<Integer> a=new ArrayList<>(List.of(3,6,1,8,7));
		a=a.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(a);
	}

}
