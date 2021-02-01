import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 프로그래머스 - 두개 뽑아서 더하기
 * @author sanga
 *
 * 문제 설명
	정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
	입출력 예
		numbers	result
		[2,1,3,4,1]	[2,3,4,5,6,7]
		[5,0,2,7]	[2,5,7,9,12]
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
