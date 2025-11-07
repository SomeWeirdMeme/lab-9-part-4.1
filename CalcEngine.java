/**
 * The main part of the calculator performing the arithmetic logic of the 
 * calculations.
 * 
 * @author: (none yet)
 * @version 0.1 (incomplete)
 */
public class CalcEngine
{
    // Put instance variables here.
    private int currentMahikValue;
    private int storedMahikValue;
    private char operator;
    private boolean startMahikNewNumber;
    /**
     * Create a CalcEngine instance.
     */
        public CalcEngine()
    {
        clear();
    }

    /**
     * Return the value of the calculator that should appear in the display right now.
     * @return The value to be shown on the calculator display.
     */
        public int getDisplayValue()
    {
        return currentMahikValue;
    }

    /**
     * A number button was pressed. Process it.
     * @param number The single digit.
     */
        public void numberPressed(int number)
    {
        if(startMahikNewNumber){
            currentMahikValue = number;
            startMahikNewNumber = false;
        } else{
            currentMahikValue = currentMahikValue * 10 + number;
        }
    }

    /**
     * This method should be called when the '+' button was pressed. 
     */
        public void plus()
    {
        storedMahikValue = currentMahikValue;
        operator = '+';
        startMahikNewNumber = true;
    }

    /**
     * This method should be called when the '-' button was pressed.
     */
        public void minus()
    {
        storedMahikValue = currentMahikValue;
        operator = '-';
        startMahikNewNumber = true;
    }
    
    /**
     * This method should be called when the '=' button was pressed.
     */
        public void equals()
    {
        switch(operator){
            case '+':
                currentMahikValue = storedMahikValue + currentMahikValue;
                break;
            case '-':
                currentMahikValue = storedMahikValue - currentMahikValue;
                break;
            default:
                break;
        }
        startMahikNewNumber = true;
        operator = '\0';
    }


    
    /**
     * This method should be called when the 'C' (clear) button was pressed.
     */
        public void clear()
    {
        currentMahikValue = 0;
        storedMahikValue = 0;
        operator = '\0';
        startMahikNewNumber = true;
    }

    /**
     * Return the name of this calculator to be shown as the title of the application.
     * @return The title of this calculation engine.
     */
        public String getTitle()
    {
        return "AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH Java Calculator";
    }

    /**
     * Return the name of the author of this application.
     * @return The author of this engine.
    */
        public String getAuthor()
    {
        return "Antony";
    }

    /**
     * Return the version number of this application.
     * @return The version number of this engine.
     */
        public String getVersion()
     {
        return "10000000.0";
    }
}
