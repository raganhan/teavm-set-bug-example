[![Build Status](https://travis-ci.org/raganhan/teavm-set-bug-example.svg?branch=master)](https://travis-ci.org/raganhan/teavm-set-bug-example)

# teavm-set-bug-example
Showcasing a possible bug with teavm. 

Some collection methods, e.g. `hashCode` and `contains`, behave differntly between pure Java and TeaVM compiled 
javascript. See unit tests and generated page for example.

To generate webpage run: `mvn clean package` then open `target/teavm-set-bug-example-1.0-SNAPSHOT/index.html` in a browser, result is:

```
All these methods in Java return true, see unit tests, but when compiled to javascript they don't have a equivalent behavior

Comparing HashSet<HashSet<String>>
* hashCode: false
* contains: false
* containsAll: false
Comparing HashSet<String>
* hashCode: false
* contains: true
* containsAll: true
```
