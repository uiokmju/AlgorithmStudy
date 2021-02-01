import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 프로그래머스 - 두개 뽑아서 더하기
 * @author sanga
 *
 */
public class Solution_1 {
	public int[] solution(int[] numbers) {

		//int[] numbers = {5,0,2,7};
		int[] answer = {};
		List<Integer> addNum = new ArrayList<Integer>();
		//오름차순으로 정렬 - 배열 정렬 방법
		Arrays.sort(numbers);
		
		for( int i = 0; i < numbers.length; i++ ) {
			for( int j = i + 1 ;j < numbers.length; j++ ) {
				if( !addNum.contains(numbers[i] + numbers[j]) )
				{
					addNum.add(numbers[i] + numbers[j]);
				}
			}
		}
		//오름차순으로 정렬 - List 정렬 방법
		Collections.sort(addNum);
		
		answer = new int[addNum.size()];
		for( int i = 0; i < addNum.size(); i++ ) {
			System.out.print(i);
			answer[i] = addNum.get(i);
		}
		
		return answer;
	
	}
}
