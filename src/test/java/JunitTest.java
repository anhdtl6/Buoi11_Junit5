import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class JunitTest {
    @Test
    void AssertEquals() {
        /* AssertEquals để kiểm tra kqua tính toán có giống vs kqua mong đợi
        AssertNotEquals để kiểm tra kết quả tính toán được chấp nhận nếu biểu thức sai */
        assertEquals(8, Junit.sum(3, 5));
        assertNotEquals(6, Junit.sum(2, 3));
    }
    @Test
    void AssertArrayEquals() {
        /* AssertArrayEquals để kiểm tra 2 mảng có bằng nhau không, được chấp nhận nếu hai mảng bằng nhau
        Case array bằng nhau*/
        String[] arr1= {"apple", "mango","tomato"};
        String[] arr2= {"apple", "mango","tomato"};
        assertArrayEquals(arr1,arr2);
        //Case array không giống nhau
        String[] arr3= {"apple", "mango","tomato"};
        String[] arr4= {"Apple", "Mango","Tomato"};
        assertArrayEquals(arr3,arr4);
    }
    @Test
    void AssertNull_AssertNotNull()
    {
        /*assertNull() khẳng định rằng một object là null
        assertNotNull() khẳng định rằng object là not null*/
       String Null= null;
       String notNull = "Java khó hay dễ";
       assertNull(Null);
       assertNotNull(notNull);
    }
    @Test
    void AssertTrue_AssertFalse()
    {
        /*assertTrue dùng để xác minh điều kiện trả về true.
          assertFalse() dùng để xác minh điều kiện trả về là false */
        assertTrue(Junit.number(4));
        assertFalse(Junit.number(7));
    }
    @Test
    void AssertSame_AssertNotSame()
    {
        /* assertSame() khẳng định rằng 2 object có cùng tham chiếu tới chính xác cùng một object.
            assertNotSame() khẳng định rằng 2 object không tham chiếu đến cùng một đối tượng */
        String method1= "Im lặng là vàng";
        String method2= "Nói ra là kim cương";
        String method3= method2;
        assertSame(method2, method3);
        assertNotSame(method1,method2);
    }
}