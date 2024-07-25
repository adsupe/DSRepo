package ultimate.java.progs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddCommaToElementExample {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2,3,4,5,6,7,8);
		List<String> strList = numList.stream().map(i->String.valueOf(i)).collect(Collectors.toList());
		String result = String.join(", ",numList.stream().parallel().map(i->String.valueOf(i)).collect(Collectors.toList()));
		System.out.println("Add comma :: "+result);
	}

}
