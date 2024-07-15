package lotto.model;

import java.util.List;

import lotto.util.LottoArgument;

public class Lotto {
	private final List<Integer> numbers;
	
    public Lotto(List<Integer> numbers) {
    	this.numbers = numbers;
        LottoArgument.validate(numbers);
        LottoArgument.lottoRange(numbers);
    }
    
    // TODO: 추가 기능 구현

}
