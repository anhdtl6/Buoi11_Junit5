import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void TestCar()
    {
        String []Car={"Toyota","Volvo","BMW","Ford","Mazda"};
        assertThat(Car).isNotEmpty()
                .hasSize(5)
                .doesNotHaveDuplicates();
    }
}