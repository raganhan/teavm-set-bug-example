package foo.bar;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SetOfSetsExampleTest
{
    private final SetOfSetsExample subject = new SetOfSetsExample();

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

