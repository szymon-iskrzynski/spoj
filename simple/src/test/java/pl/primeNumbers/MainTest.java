package pl.primeNumbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;
import static pl.primeNumbers.Main.isItPrimeNumber;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    static Stream<Arguments> testParameters() {
        return Stream.of(
                arguments(11, "TAK"),
                arguments(1, "NIE"),
                arguments(4, "NIE")
        );
    }

    @ParameterizedTest(name = "should return {1} for number {0}")
    @MethodSource("testParameters")
    void shouldVerifyPrimeNumber(int aNumber, String aString ) {
        assertThat(isItPrimeNumber(aNumber)).isEqualTo(aString);
    }
}