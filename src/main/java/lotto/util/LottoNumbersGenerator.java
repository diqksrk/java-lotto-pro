package lotto.util;

import static lotto.constant.LottoConstant.LOTTO_LINE_LENGTH;
import static lotto.constant.LottoConstant.LOTTO_NUMBER_LOWER_BOUND;
import static lotto.constant.LottoConstant.LOTTO_NUMBER_UPPER_BOUND;

import lotto.constant.LottoConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoNumbersGenerator {
    private static final List<Integer> LOTTO_NUMBERS_CANDIDATE = generateLottoNumbersCandidate();

    public static List<Integer> generateLottoNumbersCandidate() {
        return IntStream.rangeClosed(LOTTO_NUMBER_LOWER_BOUND, LOTTO_NUMBER_UPPER_BOUND)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> generateLottoNumbers() {
        List<Integer> lottoNumbersCandidate = new ArrayList<>(LOTTO_NUMBERS_CANDIDATE);
        Collections.shuffle(lottoNumbersCandidate);
        List<Integer> lottoNumbers = lottoNumbersCandidate.subList(0, LOTTO_LINE_LENGTH);
        Collections.sort(lottoNumbers);
        return lottoNumbers;
    }

}
