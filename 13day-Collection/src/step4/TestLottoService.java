package step4;

import java.util.TreeSet;

public class TestLottoService {
	public static void main(String[] args) {
		LottoService service = new LottoService();
		TreeSet<Integer> lottoNumSet = service.createLottoNum();
		System.out.println(lottoNumSet);
		/*
		 * 위 코드를 실행하면 1부터 45사이의 임의의 수 6개 Set 반환되어 출력
		 * 정렬된 값이 출력
		 */
	}
}
