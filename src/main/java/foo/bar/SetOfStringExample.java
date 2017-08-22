package foo.bar;

import java.util.HashSet;

public class SetOfStringExample
{
    private static final String[] strings = new String[]{ "one", "two", "three" };

    private final HashSet<String> hashSet1;
    private final HashSet<String> hashSet2;

    public SetOfStringExample()
    {
        hashSet1 = new HashSet<>();
        hashSet2 = new HashSet<>();

        for(String s : strings)
        {
            hashSet1.add(s);
            hashSet2.add(s);
        }
    }

    public boolean hashCodeEquivalence()
    {
        return hashSet1.hashCode() == hashSet2.hashCode();
    }

    public boolean containsEquivalence()
    {
        boolean r = true;

        for(String s : hashSet2){
            r = r && hashSet1.contains(s);
        }

        for(String s : hashSet1){
            r = r && hashSet2.contains(s);
        }

        return r;
    }

    public boolean containsAllEquivalence()
    {
        return hashSet1.containsAll(hashSet2) && hashSet2.containsAll(hashSet1);
    }
}
