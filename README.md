# Sealed Class Example
This branch changes the [Factory method example](https://github.com/gabrielcostasilva/dp-factory-method.git) to show _sealed class_, a [new feature introduced in Java 17](https://openjdk.java.net/jeps/409).

A _sealed class_ enables creating closed inheritance. In summary, it means that the superclass has a limited set of known subclasses. Venkat Subramaniam gives a [good introduction on sealed classes](https://www.youtube.com/watch?v=Xkh5sa3vjTE) if you are interested in knowing more about it.

## Project Overview

The only changes made in this code are those that introduced by the `sealed` and `permits` keywords. Whereas the former marks the class or interface as a _sealed class_, the latter declares the known subclasses. The code snippet below exemplifies their use.

```java
// (...)

public sealed abstract class AbstractDataRetriever<E> 
    permits CityDataRetriever, FarmerDataRetriever, RegionDataRetriever {

   // (...)
}
```

In addition, the `final` keyword _closes_ the inheritance, as it unables the subclass extension.

```java
// (...)

public final class CityDataRetriever 
        extends AbstractDataRetriever<String> {

   //  (...)
}
```

A class extending a _sealed class_ must be `final`, `sealed` or `non-sealed`.

## Project Setup
```
mvn clean test
```
