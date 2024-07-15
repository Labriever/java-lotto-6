package lotto.view;

import java.util.Collection;
import java.util.List;

public class ResultView {
	
	public void boughtRotto(int num, List<Integer>[] userLotto) {
		System.out.println(num + "개를 구매했습니다.");
		
		for(int i=0;i<num;i++) {
			System.out.println(userLotto[i].toString());
		}
	}
	public void result() {
		System.out.println("당첨 통계");
		System.out.println("---");
		
		System.out.println("3개 일치 (5,000원) - 1개");
		System.out.println("4개 일치 (50,000원) - 1개");
		System.out.println("5개 일치 (1,500,000원) - 1개");
		System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - 1개");
		System.out.println("6개 일치 (20,000,000,000원) - 1개");
		
		System.out.println("총 수익률은 60% 입니다.");
		
	}
	
}
