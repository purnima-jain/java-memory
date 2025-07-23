call setJavaEnv.bat
call compileApp.bat


REM ************************************************************************************


echo ************************************************************************************

REM ***************** Displays the most useful flags controlling the heap size and garbage collection along with their values.****************
%JAVA% -XX:+PrintCommandLineFlags -version

echo ************************************************************************************

REM ***************** Displays all the global JVM tuning flags ***************** 
REM %JAVA% -XX:+PrintFlagsFinal -version

echo ************************************************************************************

REM **************** Generates GC Log ****************
REM %JAVA% -Xms10m -Xmx20m -Xlog:gc*:file=.\garbage\gc.log -cp ./target/java-garbage-collection-0.0.1-SNAPSHOT.jar com.purnima.jain.NoOOMCrash

echo ************************************************************************************

REM **************** Triggers Out of Memory Error due to Heap Space ****************
REM %JAVA% -Xms10m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError -XX:+UseGCOverheadLimit -cp ./target/java-garbage-collection-0.0.1-SNAPSHOT.jar com.purnima.jain.OOMCrash

