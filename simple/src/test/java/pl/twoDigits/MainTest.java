package pl.twoDigits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;
import static pl.twoDigits.Main.lastDigits;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    static Stream<Arguments> testParameters() {
        return Stream.of(
                arguments(1, 1),
                arguments(2, 2),
                arguments(3, 6),
                arguments(4, 24)

        );
    }

    @ParameterizedTest(name = "should return {1} for number {0}")
    @MethodSource("testParameters")
    void shouldVerifyLastDigitsMethod(int aNumber, int aDigit) {
        assertThat(lastDigits(aNumber)).isEqualTo(aDigit);
    }
}