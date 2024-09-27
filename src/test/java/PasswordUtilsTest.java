import org.example.PasswordStrength;
import org.example.PasswordUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PasswordUtilsTest {
    @ParameterizedTest
    @MethodSource("provideStrongPasswords")
    void testStrongPasswords(String password) {
        System.out.println(password);
        assertEquals(PasswordStrength.STRONG, PasswordUtils.getStrength(password));
    }

    @ParameterizedTest
    @MethodSource("provideWeakPasswords")
    void testMediumPasswords(String password) {
        System.out.println(password);
        assertEquals(PasswordStrength.MEDIUM, PasswordUtils.getStrength(password));
    }

    @ParameterizedTest
    @MethodSource("provideMediumPasswords")
    void testWeakPasswords(String password) {
        System.out.println(password);
        assertEquals(PasswordStrength.WEAK, PasswordUtils.getStrength(password));
    }

    static List<String> provideStrongPasswords() {
        return List.of("aN we2aM", "*****Jj0", "Ux134!&");
    }

    static List<String> provideMediumPasswords() {
        return List.of("QWERTY2", "Admin01", "2418^ax00");
    }

    static List<String> provideWeakPasswords() {
        return List.of("password", "f8HdA*", "Y20220101");
    }
}
