package lotto.model;

import java.util.List;
import java.util.Set;

import lotto.util.LottoArgument;

public class AnswerLotto {
	private final Set<Integer> numbers;
	private int bonus;
	
    public AnswerLotto(Set<Integer> numbers) {
    	this.numbers = numbers;
        LottoArgument.validate(numbers);
        LottoArgument.lottoRange(numbers);
    }

	public int getBonus() {
		return bonus;
	}

    // TODO: 추가 기능 구현
	
}
