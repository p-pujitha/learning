#!/bin/sh




export APP_HOME=/apps/virtualthreadstest




export JVM_ARGS="-Xdebug -Xrunjdwp:transport=dt_socket,address=3160,server=y,suspend=n"
export CLASSPATH="$APP_HOME/lib/virtualthreads-1.0-SNAPSHOT.jar"
 for i in `ls $APP_HOME/lib/dependency/*.jar`; do
  CLASSPATH=$i:$CLASSPATH
 done




java  $JVM_ARGS -cp "$CLASSPATH":.:  org.pujitha.MysqlTableCreate 1000 10000 5  &

