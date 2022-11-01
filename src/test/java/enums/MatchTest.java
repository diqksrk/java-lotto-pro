package enums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static enums.Match.isSecond;
import static enums.Match.isZero;
import static org.assertj.core.api.Assertions.assertThat;

class MatchTest {

    @BeforeEach
    void setUp() {}

    @Test
    @DisplayName("매치 find 테스트")
    void find_match_test() {
        Match match = Match.findMatch(4, false);

        assertThat(match).isEqualTo(Match.FOURTH);
    }

    @Test
    @DisplayName("2등 매치 find 테스트")
    void find_second_match_test() {
        Match match = Match.findMatch(4, true);

        assertThat(match).isEqualTo(Match.SECOND);
    }

    @Test
    @DisplayName("2등 매치 equals 테스트")
    void find_second_match_equals_test() {
        Match match = Match.findMatch(4, true);

        assertThat(isSecond(match)).isTrue();
    }

    @Test
    @DisplayName("제로 매치 equals 테스트")
    void find_zero_match_equals_test() {
        Match match = Match.findMatch(0, true);

        assertThat(isZero(match)).isTrue();
    }
}