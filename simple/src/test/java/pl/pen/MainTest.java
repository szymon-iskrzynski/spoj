package pl.pen;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;
import static pl.pen.Main.shortString;
import static org.assertj.core.api.Assertions.assertThat;

class MainTest {

    static Stream<Arguments> testParameters() {
        return Stream.of(
                arguments("OPSS", "OPSS"),
                arguments("ABCDEF", "ABCDEF"),
                arguments("ABBCCCDDDDEEEEEFGGHIIJKKKL", "ABBC3D4E5FGGHIIJK3L"),
                arguments("AAAAAAAAAABBBBBBBBBBBBBBBB", "A10B16")
        );
    }

    @ParameterizedTest(name = "should return {1} for number {0}")
    @MethodSource("testParameters")
    void shouldVerifyLastDigitsMethod(String aNormalString, String aShortString) {
        assertThat(shortString(aNormalString)).isEqualTo(aShortString);
    }
}