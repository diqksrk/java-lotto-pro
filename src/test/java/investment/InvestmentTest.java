package investment;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InvestmentTest {

	@Test
	@DisplayName("금액_2000원_입력_수량_2 성공")
	public void investmentInputSuccess() {
		String input = "2000";
		Investment investment = new Investment(input);

		assertThat(investment.getPrice()).isEqualTo(new Price(input));
		assertThat(investment.getCount()).isEqualTo(2);

	}
}
