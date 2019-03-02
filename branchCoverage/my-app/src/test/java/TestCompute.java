import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  @Test
  public void test1(){
      MessageQueue mq=mock(MessageQueue.class);
      c=new Compute(mq);
      when(mq.size()).thenReturn(0);
      assertEquals(-1,c.countNumberOfOccurrences("aliveli"));
  }
@Test
    public void test2(){
        MessageQueue mq=mock(MessageQueue.class);
        c=new Compute(mq);
        when(mq.size()).thenReturn(5);
        when(mq.contains(anyString())).thenReturn(false);
        assertEquals(0,c.countNumberOfOccurrences("aliveli"));
    }
    @Test
    public void test3(){
        MessageQueue mq=mock(MessageQueue.class);
        c=new Compute(mq);
        when(mq.size()).thenReturn(5);
        when(mq.contains(anyString())).thenReturn(true);
        when(mq.getAt(anyInt())).thenReturn("aliveli");
        assertEquals(5,c.countNumberOfOccurrences("aliveli"));
    }
    @Test
    public void test4(){
        MessageQueue mq=mock(MessageQueue.class);
        c=new Compute(mq);
        when(mq.size()).thenReturn(5);
        when(mq.contains(anyString())).thenReturn(true);
        when(mq.getAt(anyInt())).thenReturn("aliveli");
        assertEquals(0,c.countNumberOfOccurrences("alivelia"));
    }
}