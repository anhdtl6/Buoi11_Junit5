import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AssertJTest {
    @Test
    void testEmail() {
        String email = "anhdo@onemount.com";
        assertThat(email).containsOnlyOnce("@")
                .isNotNull()
                .doesNotStartWith("@")
                .doesNotEndWith("@")
                .containsPattern("^[a-zA-Z0-9][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,4})$");
    }

    @Test
    void HumanWeight() {
        double weight = 50.2;
        assertThat(weight).isNotZero()
                .isNotNull()
                .isBetween(0.0, 150.0)
                .isGreaterThan(0.0)
                .isLessThan(150.0)
                .isCloseTo(50.0, Offset.offset(0.5d));
    }

    @Test
    public void CMND() {
        String[] SoCMND = new String[]{"123456789", "123456789", "123456789", "123456789", "123456789"};
        for (int i = 0; i < SoCMND.length; i++) {
            assertThat(SoCMND[i]).containsOnlyDigits()
                    .hasSize(9)
                    .isNotNull();
        }
    }
}