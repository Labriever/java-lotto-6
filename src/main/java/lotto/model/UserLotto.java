package lotto.model;

import java.util.ArrayList;
import java.util.List;

import lotto.util.RandomNumberGenerator;

public class UserLotto {
	private final List<Integer>[] userLotto;

	public UserLotto(List<Integer>[] userLotto) {
		this.userLotto = userLotto;
	}

	public List<Integer>[] getUserLotto() {
		return userLotto;
	}
	
	private static List<Integer>[] makeLotto(int num, List<Integer>[] userLotto) {
		userLotto = new ArrayList[num];
		for(int i=0;i<7;i++) {
			userLotto[i] = new ArrayList<>();
			for(int j=0;j<7;j++) {
				int tmp = RandomNumberGenerator.generate();
				userLotto[i].add(tmp);
			}
		}
		
		return userLotto;
	}

	
}
