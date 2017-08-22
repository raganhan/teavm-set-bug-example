package foo.bar;

import java.util.HashSet;


public class SetOfSetsExample
{
    private static final String[][] stringsTable = new String[][]{
        {"one", "two", "three"},
        {"blue"},
        {"5", "6"}
    };

    private final HashSet<HashSet<String>> hashSet1;
    private final HashSet<HashSet<String>> hashSet2;

    public SetOfSetsExample()
    {
        hashSet1 = new HashSet<>();
        hashSet2 = new HashSet<>();

        for(String[] row : stringsTable)
        {
            final HashSet<String> s1 = new HashSet<>();
            final HashSet<String> s2 = new HashSet<>();
            for(String s : row)
            {
                s1.add(s);
                s2.add(s);
            }

            hashSet1.add(s1);
            hashSet2.add(s2);
        }
    }

    public boolean hashCodeEquivalence()
    {
        return hashSet1.hashCode() == hashSet2.hashCode();
    }

    public boolean containsEquivalence()
    {
        boolean r = true;

        for(HashSet<String> s : hashSet2){
            r = r && hashSet1.contains(s);
        }

        for(HashSet<String> s : hashSet1){
            r = r && hashSet2.contains(s);
        }

        return r;
    }

    public boolean containsAllEquivalence()
    {
        return hashSet1.containsAll(hashSet2) && hashSet2.containsAll(hashSet1);
    }
}
