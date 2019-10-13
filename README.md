# jaxb-for-scalac

This is a NO-OP scalac plugin for injecting JAXB library into compilation classpath.

In Java 9 javax.xml package was deprecated, and it was fully removed in Java 11.  
If you are having problems since some of your scala compiler plugins depend on JAXB,
load this Noop plugin which will bring in the external JAXB dependency:

    addCompilerPlugin("com.oradian.util" %% "jaxb-for-scalac" % "2.3.1-0")

Other than just JAXB, this project can easily be extended to bring in any other
library dependency into scalac classpath - simply use it as a template for the hackish
"build fat scalac plugin jar with dependencies" workaround first documented in https://github.com/sbt/sbt/issues/2255

This is free and unencumbered software released into the public domain.
