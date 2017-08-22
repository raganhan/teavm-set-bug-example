package foo.bar;

import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;

public class Client {
    public static void main(String[] args) {
        HTMLDocument document = HTMLDocument.current();

        HTMLElement div = document.createElement("div");
        div.appendChild(document.createTextNode("All these methods in Java return true, see unit tests, but when " +
            "compiled to javascript they don't have a equivalent behavior"));
        document.getBody().appendChild(div);

        document.getBody().appendChild(document.createElement("br"));

        SetOfSetsExample setOfSetsExample = new SetOfSetsExample();
        addList(
            document,
            "Comparing HashSet<HashSet<String>>",
            "hashCode: " + setOfSetsExample.hashCodeEquivalence(),
            "contains: " + setOfSetsExample.containsEquivalence(),
            "containsAll: " + setOfSetsExample.containsAllEquivalence()
        );

        SetOfStringExample setOfStringExample = new SetOfStringExample();
        addList(
            document,
            "Comparing HashSet<String>",
            "hashCode: " + setOfStringExample.hashCodeEquivalence(),
            "contains: " + setOfStringExample.containsEquivalence(),
            "containsAll: " + setOfStringExample.containsAllEquivalence()
        );
    }

    private static void addList(HTMLDocument document, String title, String... elements)
    {
        HTMLElement div = document.createElement("div");
        div.appendChild(document.createTextNode(title));

        HTMLElement ul = document.createElement("ul");
        div.appendChild(ul);

        for(String s : elements)
        {
            HTMLElement li = document.createElement("li");
            li.appendChild(document.createTextNode(s));
            ul.appendChild(li);
        }

        document.getBody().appendChild(div);
    }
}
