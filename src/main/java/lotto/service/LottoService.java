package lotto.service;

import java.util.ArrayList;
import java.util.List;

import lotto.util.RandomNumberGenerator;

public class LottoService {
	public static List<Integer>[] makeLotto(int num, List<Integer>[] userLotto) {
		userLotto = new ArrayList[num];
		for(int i=0;i<num;i++) {
			userLotto[i] = new ArrayList<>();
			for(int j=0;j<7;j++) {
				int tmp = RandomNumberGenerator.generate();
				userLotto[i].add(tmp);
			}
		}
		
		return userLotto;
	}
	
}
