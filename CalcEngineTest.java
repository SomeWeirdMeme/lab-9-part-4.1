
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CalcEngineTest. QUESTION 37 RAHHHHH
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CalcEngineTest
{
    private CalcEngine calc;
    /**
     * Default constructor for test class CalcEngineTest
     */
    public CalcEngineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        calc = new CalcEngine();
    }
    
    public void testIntDisplay(){
        assertEquals(0, calc.getDisplayValue(), "Bruza Intitial display should be 0");
    }
    
    public void testNumberpress(){
        calc.numberPressed(5);
        assertEquals(5, calc.getDisplayValue(), " button 5 shoud show 5");
    }
    
    public void testNumberpressMany(){
        calc.numberPressed(1);
        calc.numberPressed(2);
        calc.numberPressed(3);
        assertEquals(123, calc.getDisplayValue(), "TYPE 1,2 AND 3 SHOUD SHOW 123 i think");
        
    }
    
    public void testPlus(){
        calc.numberPressed(7);
        calc.plus();
        calc.numberPressed(3);
        calc.equals();
        assertEquals(10, calc.getDisplayValue(), "7 + 3 MAYBVE equals 10");
    }
    
    public void testMinus(){
        calc.numberPressed(9);
        calc.minus();
        calc.numberPressed(4);
        calc.equals();
        assertEquals(5, calc.getDisplayValue(), "9 -  4 MAYBVE equals 10");
    }
    
    public void testClear(){
        calc.numberPressed(5);
        calc.plus();
        calc.numberPressed(2);
        calc.clear();
        assertEquals(0, calc.getDisplayValue(), "magicv make it into a 0");
    }
    
    public void testManyOps(){
        calc.numberPressed(5);
        calc.plus();
        calc.numberPressed(3);
        calc.equals(); 
        assertEquals(8, calc.getDisplayValue(), "5 + 3 will equal 8");
        calc.minus();
        calc.numberPressed(2);
        calc.equals(); 
        assertEquals(6, calc.getDisplayValue(), "8 - 2 should mayube equal 6");
    }
    
    public void testSuperMetaverseData(){
        assertEquals("Simple JavaFX Calculator", calc.getTitle());
        assertEquals("Anthony", calc.getAuthor());
        assertEquals("1.0", calc.getVersion());
    }
}