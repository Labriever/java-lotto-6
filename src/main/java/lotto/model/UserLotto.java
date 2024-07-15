package lotto.model;

import java.util.List;

public class UserLotto {
	private final List<Integer>[] userLotto;
	private final int num;
	
	public UserLotto(int num, List<Integer>[] userLotto) {
		this.num = num;
		this.userLotto = userLotto;
	}

	public List<Integer>[] getUserLotto() {
		return userLotto;
	}
	
}
