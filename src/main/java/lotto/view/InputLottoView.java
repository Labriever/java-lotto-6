package lotto.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import lotto.util.LottoArgument;

public class InputLottoView {
	private final Scanner SC = new Scanner(System.in);

	public int getPay() {
		System.out.println("구입금액을 입력해 주세요.(천 원 단위로 작성해주세요)");

		int input = SC.nextInt();
		LottoArgument.buyLotto(input);
		return (input/1000);
	}
	
	public Set<Integer> getLotto(){
		System.out.println("당첨 번호를 입력해주세요.");
		String answer = SC.next();
		Set<Integer> lotto = Arrays.stream(answer.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
		LottoArgument.lottoRange(lotto);
		return lotto;
		
	}

	public int bonus() {
		// TODO Auto-generated method stub
		System.out.println("보너스 번호를 입력해 주세요.");
		int input = SC.nextInt();
		LottoArgument.numberrange(input);
		return input;
	}

}
