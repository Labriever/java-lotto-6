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
	
	public void preResult() {
		System.out.println("당첨 통계");
		System.out.println("---");
	}
	
	public void result(Map<Integer, Integer> answer, List<Integer>[] list) {
		int count = list.length;
		
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
		double revenue = (double)plus / (count*1000);
		revenue = Math.round(revenue*1000)/10.0;
		
		System.out.println("총 수익률은 "+revenue+"% 입니다.");
		
	}
	
}
