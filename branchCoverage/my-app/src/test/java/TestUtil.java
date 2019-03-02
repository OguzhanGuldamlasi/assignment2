import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }
  @Test
  public void test1(){//test for 1 sized array
    assertFalse(c.compute(1));
  }
  @Test
  public void test2(){//test for even sized
    assertFalse(c.compute(1,2,3,4));
  }
  @Test
  public void test3(){//Checking the exception
    try {
      c.compute(0,0,0,0,0);
    }
    catch(Exception e){
      assertEquals(e.getClass(),RuntimeException.class);
    }
  }
  @Test
  public void test4(){
    assertTrue(c.compute(1,1,1,1,1));
  }
  @Test
  public void test5(){
    assertFalse(c.compute(2,4,6,8,7));
  }
}