package lotto.model;

import java.util.List;

import lotto.util.LottoArgument;

public class AnswerLotto {
	private final List<Integer> numbers;
	private int bonus;
	
    public AnswerLotto(List<Integer> numbers) {
    	this.numbers = numbers;
        LottoArgument.validate(numbers);
        LottoArgument.lottoRange(numbers);
    }

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

    // TODO: 추가 기능 구현
}
