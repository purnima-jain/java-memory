call compileApp.bat


REM ******************************************


REM ***************** Displays command line options with their values ****************
REM %JAVA% -XX:+PrintCommandLineFlags -version


REM **************** Generates GC Log ****************
REM %JAVA% -Xms10m -Xmx20m -Xlog:gc*:file=.\garbage\gc.log -cp ./target/java-garbage-collection-0.0.1-SNAPSHOT.jar com.purnima.jain.NoOOMCrash


REM **************** Triggers Out of Memory Error due to Heap Space ****************
REM %JAVA% -Xms10m -Xmx20m -verbose:gc -cp ./target/java-garbage-collection-0.0.1-SNAPSHOT.jar com.purnima.jain.OOMCrash

