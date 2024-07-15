package lotto.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lotto.util.RandomNumberGenerator;

public class LottoService {
	public List<Integer>[] makeLotto(int num, List<Integer>[] userLotto) {
		userLotto = new ArrayList[num];
		for(int i=0;i<num;i++) {
			boolean[] bool = new boolean[46];
			userLotto[i] = new ArrayList<>();
			while(userLotto[i].size()<7) {
				int tmp = RandomNumberGenerator.generate();
				if(!bool[tmp]) {
					userLotto[i].add(tmp);
					bool[tmp] = true;
				}
			}
			Collections.sort(userLotto[i]);
		}
		return userLotto;
	}
	
}
