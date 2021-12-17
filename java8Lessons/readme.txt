http://tutorials.jenkov.com/java-functional-programming/streams.html
Dimaond Problem - https://www.javacodemonk.com/diamond-problem-of-inheritance-in-java-8-88faf6c9
	1. Any method inherited from a class or a superclass is given higher priority over any default method inherited from an interface.
	2. Derived interfaces or sub-interfaces take higher precedence than the interfaces higher-up in the inheritance hierarchy.
	3. In case Rule 1 and Rule 2 are not able to resolve the conflict then the implementing class has to specifically override and provide a method with the same method definition.
