call compileApp.bat

%JAVA% -XX:+PrintCommandLineFlags -version

%JAVA% ^
        -Xms1g ^
        -Xmx2g ^
        -cp ./target/java-garbage-collection-0.0.1-SNAPSHOT.jar com.purnima.jain.OOMCrash
