package pac1;

import org.testng.annotations.Test;

public class Smoke_Test
{
    @Test(groups= {"SmokeTest"})
    public void f()
    {
    	System.out.println("Smoke Test");
    }
    @Test
    public void m()
    {
    	System.out.println("Regression Test");
    }
    
}
