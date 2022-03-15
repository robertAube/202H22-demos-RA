package personnage;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses( { SorcierTest.class, PersonnageTest.class } )
public class AllTest {
    public class JUnit5TestSuite
    {
    }
}
