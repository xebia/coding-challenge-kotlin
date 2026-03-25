import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals

class PascalsTriangleTest {

    private lateinit var pascalsTriangle: PascalsTriangle

    @Before
    fun setUp() {
        pascalsTriangle = PascalsTriangle()
    }

    @Test
    fun testRow0Returns() {
        assertEquals(listOf(1), pascalsTriangle.triangleRow(0))
    }

    @Test
    fun testRow1Returns() {
        assertEquals(listOf(1, 1), pascalsTriangle.triangleRow(1))
    }

    @Test
    fun testRow2Returns() {
        assertEquals(listOf(1, 2, 1), pascalsTriangle.triangleRow(2))
    }

    @Test
    fun testRow3Returns() {
        assertEquals(listOf(1, 3, 3, 1), pascalsTriangle.triangleRow(3))
    }

    @Test
    fun testRow4Returns() {
        assertEquals(listOf(1, 4, 6, 4, 1), pascalsTriangle.triangleRow(4))
    }
}
