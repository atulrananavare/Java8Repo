package lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class SortUsingLamda {

	public static void main(String[] args) {
	
		ArrayList<Integer> list=new ArrayList<>();
		list.add(678);
		list.add(56);
		list.add(400);
		list.add(100);
		
		Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(Integer::intValue, Integer::intValue));
		
		System.out.println(map);
		
		Comparator<Integer> I=(o1,o2)->(o1<o2)?-1:
										(o1>o2)?1:
											0;
		
		Collections.sort(list, I);
		
		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

}
