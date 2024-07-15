package lotto.util;

import java.util.List;

public class LottoArgument {
	
	// 로또 번호는 1~45 사이
	public static void lottoRange(List<Integer> number) {
		for(int lotto : number) {
			
		}
	}
	
	private static void numberrange(int lotto) {
		if(lotto < 1 || lotto > 45) {
			throw new IllegalArgumentException("로또 번호는 1부터 45 사이의 숫자여야 합니다.");
		}
	}
	
	// 로또 구매는 1000원 단위로만 구매할 수 있으며, 100원 단위가 나오면 예외처리/
	public static void buyLotto(int pay) {
		if(pay % 1000 != 0) {
			throw new IllegalArgumentException("1000원 단위로만 구매할 수 있습니다.");
		}
	}
	
	// 로또 번호의 갯수는 총 6개
	public static void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("번호는 6개여야 합니다.");
        }
    }
}
