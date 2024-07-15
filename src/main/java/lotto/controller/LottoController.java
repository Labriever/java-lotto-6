package lotto.controller;

import java.util.List;

import lotto.service.LottoService;
import lotto.view.InputLottoView;
import lotto.view.ResultView;

public class LottoController {
	
	private final LottoService service;
	private final InputLottoView view;
	private final ResultView result;
	
	public LottoController(LottoService service, InputLottoView view, ResultView result) {
		super();
		this.service = service;
		this.view = view;
		this.result = result;
	}
	
	public void run() {
		int pay = view.getPay();
		List<Integer>[] list = new List[pay];
		list = service.makeLotto(pay, list);
		result.boughtRotto(pay, list);
		
		List<Integer> answerNum = view.getLotto();
		int bonus = view.bonus();
		
		result.result();
	}
}
