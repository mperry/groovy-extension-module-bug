groovy-extension-module-bug
===========================
This repository demonstrates a compilation error with the Groovy compiler where the compiler
reports a bug when calling a method added by an extension module to a class using Groovy 2.2.  The error message is:

"Declaring class for method call to 'fj.data.Stream to(java.lang.Integer, java.lang.Integer)' declared in java.lang.Integer was not matched with found receiver int. This should not have happened!."

The full output is included below.  Machine details are:
- Gradle 1.9
- Java 1.7.0_45 64 bit
- Groovy 2.2.1

This example compiles with Groovy 2.1.6.  Changing the Groovy version on lines 7 and 8 in build.gradle demonstrates this.

Run the example using: gradle -i clean build

----------------
Executing org.gradle.api.internal.tasks.compile.ApiGroovyCompiler@12e146a7 in compiler daemon.
Exception executing org.gradle.api.internal.tasks.compile.ApiGroovyCompiler@12e146a7 in compiler daemon: BUG! exception in phase 'instruction selection' in source unit 'D:\repositories\groovy-extension-module-bug\src\test\groovy\com\github\mperry\fg\Example.groovy' Declaring class for method call to 'fj.data.Stream to(java.lang.Integer, java.lang.Integer)' declared in java.lang.Integer was not matched with found receiver int. This should not have happened!.
:compileTestGroovy FAILED
:compileTestGroovy (Thread[main,5,main]) completed. Took 3.952 secs.

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':compileTestGroovy'.
> BUG! exception in phase 'instruction selection' in source unit 'D:\repositories\groovy-extension-module-bug\src\test\groovy\com\github\mperry\fg\Example.groovy' Declaring class for method call to 'fj.data.Stream to(java.lang.Integer, java.lang.Integer)' declared in java.lang.Integer was not matched with found receiver int. This should not have happened!

* Try:
Run with --stacktrace option to get the stack trace. Run with --debug option to get more log output.

BUILD FAILED

Total time: 11.865 secs
Stopped 1 Gradle compiler daemon(s).

MarkPerry@SUNNY /d/repositories/groovy-extension-module-bug (master)
$
----------------