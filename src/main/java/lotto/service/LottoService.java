package lotto.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lotto.util.RandomNumberGenerator;

public class LottoService {
	public List<Integer>[] makeLotto(int num, List<Integer>[] userLotto) {
		userLotto = new ArrayList[num];
		boolean[] bool = new boolean[45];
		for(int i=0;i<num;i++) {
			userLotto[i] = new ArrayList<>();
			while(userLotto[i].size()<7) {
				int tmp = RandomNumberGenerator.generate();
				if(!bool[tmp]) {
					userLotto[i].add(tmp);
				}
			}
			Collections.sort(userLotto[i]);
		}
		
		return userLotto;
	}
	
}
