package lotto.model;

import java.util.List;

import lotto.service.LottoService;

public class UserLotto {
	private final List<Integer>[] userLotto;
	private final int num;
	
	public UserLotto(int num, List<Integer>[] userLotto) {
		this.num = num;
		this.userLotto = LottoService.makeLotto(num, userLotto);
	}

	public List<Integer>[] getUserLotto() {
		return userLotto;
	}
	
}
