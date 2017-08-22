package foo.bar;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SetOfStringExampleTest
{
    private final SetOfStringExample subject = new SetOfStringExample();

    @Test
    public void hashCodeEquivalence() throws Exception
    {
        assertEquals(true, subject.hashCodeEquivalence());
    }

    @Test
    public void contains() throws Exception
    {
        assertEquals(true, subject.containsEquivalence());
    }

    @Test
    public void containsAll() throws Exception
    {
        assertEquals(true, subject.containsAllEquivalence());
    }
}
