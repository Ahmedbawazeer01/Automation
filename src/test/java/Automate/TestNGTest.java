package Automate;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class TestNGTest {
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @AfterSuite
  public void afterSuite() {
  }


  @Test
  public void fTest() {
    throw new RuntimeException("Test not implemented");
  }
}
