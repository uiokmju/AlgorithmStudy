import java.util.*;

public class Main {
	public static void main(String[] agrs) {
		int[] numbers = {5,0,2,7};
		int[] answer = {};
		List<Integer> addNum = new ArrayList<Integer>();
		//오름차순으로 정렬
		Arrays.sort(numbers);
		
		for( int i = 0; i < numbers.length; i++ ) {
			for( int j = i + 1 ;j < numbers.length; j++ ) {
				if( !addNum.contains(numbers[i] + numbers[j]) )
				{
					addNum.add(numbers[i] + numbers[j]);
				}
			}
		}
		
		Collections.sort(addNum);
		
		answer = new int[addNum.size()];
		for( int i = 0; i < addNum.size(); i++ ) {
			System.out.print(i);
			answer[i] = addNum.get(i);
		}
		
	}
}
