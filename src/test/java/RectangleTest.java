import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RectangleTest {

    @Test
    void toCalculateAreaOfRectangleWithPositiveDimensions()
    {
        Rectangle object= new Rectangle(6,4);
        int expectedArea = 24;
        int actualArea = object.area();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    void toCalculateAreaOfRectangleWithPositiveLengthNegativeWidth()
    {
        Rectangle object = new Rectangle(6,-4);
        int expectedArea = -24;
        int actualArea = object.area();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    void toCalculateAreaOfRectangleWithNegativeLengthPositiveWidth()
    {
        Rectangle object = new Rectangle(-6,4);
        int expectedArea = -24;
        int actualArea = object.area();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    void toCalculateAreaOfRectangleWithNegativeDimensions()
    {
        Rectangle object = new Rectangle(-6,-4);
        int expectedArea = 24;
        int actualArea = object.area();
        assertEquals(expectedArea,actualArea);
    }

    @DisplayName("Perimeter of Rectangle")
    @Test
    void toCalculatePerimeterOfRectangleWithPositiveDimensions()
    {
        Rectangle object= new Rectangle(10,5);
        int expectedArea = 30;
        int actualArea = object.perimeter();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    void toCalculatePerimeterOfRectangleWithPositiveLengthNegativeWidth()
    {
        Rectangle object= new Rectangle(10,-5);
        int expectedArea = 10;
        int actualArea = object.perimeter();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    void toCalculatePerimeterOfRectangleWithNegativeLengthPositiveWidth()
    {
        Rectangle object= new Rectangle(-10,5);
        int expectedArea = -10;
        int actualArea = object.perimeter();
        assertEquals(expectedArea,actualArea);
    }

    @Test
    void toCalculatePerimeterOfRectangleWithNegativeDimensions()
    {
        Rectangle object= new Rectangle(-10,-5);
        int expectedArea = -30;
        int actualArea = object.perimeter();
        assertEquals(expectedArea,actualArea);
    }






}
