package lotto.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	
	public Map<Integer, Integer> getResult(Set<Integer> answerNum, int bonus, List<Integer>[] list) {
		int count = list.length;
		Map<Integer, Integer> answer = new HashMap<>();
		
		for(int i=0;i<count;i++) {
			int tmp = 0;
			for(int myLotto : list[i]) {
				if(answerNum.contains(myLotto)) {
					tmp++;
				}
			}
			
			boolean isBonus = false; // 숫자가 5개 다 맞을 시 체크할 bonus 숫자
			if(tmp == 5) {
				for(int myLotto : list[i]) {
					if(myLotto == bonus) {
						isBonus = true;
					}
				}
			}
			int winning = 0;
			if(isBonus) {
				winning= (answer.get(10) == null?0:answer.get(10));
				answer.put(10, ++winning);
			}else {
				winning = (answer.get(tmp) == null ? 0 : answer.get(tmp));
				answer.put(tmp, ++winning);
			}
		}
		
		return answer;
	}
	
}
