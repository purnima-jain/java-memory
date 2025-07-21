@echo off

REM ******************************************

REM Set JAVA_HOME to the location of your JDK
REM DOS batches need to have spaces escaped
SET JAVA_HOME=D:\Work\Installation\Java\jdk-21.0.4

REM Settings for java and javac derived from JAVA_HOME
SET JAVA="%JAVA_HOME%\bin\java"
SET JAVAC="%JAVA_HOME%\bin\javac"

%JAVA% -version