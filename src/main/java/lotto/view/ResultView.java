package lotto.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ResultView {
	
	public void boughtRotto(int num, List<Integer>[] userLotto) {
		System.out.println(num + "개를 구매했습니다.");
		
		for(int i=0;i<num;i++) {
			System.out.println(userLotto[i].toString());
		}
	}
	public void result(Set<Integer> answerNum, int bonus, List<Integer>[] list) {
		System.out.println("당첨 통계");
		System.out.println("---");
		
		int count = list.length;
		Map<Integer, Integer> answer = new HashMap<>();
		
		for(int i=0;i<count;i++) {
			int tmp = 0;
			for(int myLotto : list[i]) {
				if(answerNum.contains(myLotto)) {
					tmp++;
				}
			}
			boolean isBonus = false;
			if(tmp == 5) {
				for(int myLotto : list[i]) {
					if(myLotto == bonus) {
						isBonus = true;
					}
				}
			}
			int winning = 0;
			if(isBonus) {
				winning= (answer.get(10) == null?0:answer.get(10));
				answer.put(10, ++winning);
			}else {
				winning = (answer.get(tmp) == null ? 0 : answer.get(tmp));
				answer.put(tmp, ++winning);
			}
		}
		
		int three = (answer.get(3) == null?0 : answer.get(3));
		int four = (answer.get(4) == null?0 : answer.get(4));
		int five = (answer.get(5) == null?0 : answer.get(5));
		int bonusFive = (answer.get(10) == null?0 : answer.get(10));
		int six = (answer.get(6) == null?0 : answer.get(6));
		
		System.out.println("3개 일치 (5,000원) - "+ three +"개");
		System.out.println("4개 일치 (50,000원) - "+ four +"개");
		System.out.println("5개 일치 (1,500,000원) - "+ five +"개");
		System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - "+ bonusFive +"개");
		System.out.println("6개 일치 (20,000,000,000원) - "+ six +"개");

		long plus = three*5000 + four*50000+five*1500000+bonusFive*30000000+six*20000000000L; 
		System.out.println(plus);
		System.out.println(count*1000);
		double revenue = Math.round((plus / (count*1000))*100);
		
		System.out.println("총 수익률은 "+revenue+"% 입니다.");
		
	}
	
}
