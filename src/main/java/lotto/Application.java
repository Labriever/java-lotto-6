package lotto;

import lotto.controller.LottoController;
import lotto.service.LottoService;
import lotto.view.InputLottoView;
import lotto.view.ResultView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    	LottoService service = new LottoService();
    	InputLottoView view = new InputLottoView();
    	ResultView result = new ResultView();
    	
    	LottoController controller = new LottoController(service, view, result);
    	controller.run();
    	
    }
}
