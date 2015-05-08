#!/bin/sh

# This will start a command line query application

# specify the Coherence installation directory
SCRIPT_PATH="${0}"
while [ -h "${SCRIPT_PATH}" ]; do
  LS=`ls -ld "${SCRIPT_PATH}"`
  LINK=`expr "${LS}" : '.*-> \(.*\)$'`
  if [ `expr "${LINK}" : '/.*'` > /dev/null ]; then
    SCRIPT_PATH="${LINK}"
  else
    SCRIPT_PATH="`dirname "${SCRIPT_PATH}"`/${LINK}"
  fi
done

CURRENT_DIR=`pwd`
cd `dirname ${SCRIPT_PATH}` > /dev/null
SCRIPT_PATH=`pwd`
COHERENCE_HOME=`dirname $SCRIPT_PATH`
cd ${CURRENT_DIR}

# specify the jline installation directory
JLINE_HOME=$COHERENCE_HOME/lib

# specify if the console will also act as a server
STORAGE_ENABLED=false

# specify the JVM heap size
MEMORY=64m


if [ ! -f ${COHERENCE_HOME}/bin/query.sh ]; then
  echo "query.sh: must be run from the Coherence installation directory."
  exit
fi

if [ -f $JAVA_HOME/bin/java ]; then
  JAVAEXEC=$JAVA_HOME/bin/java
else
  JAVAEXEC=java
fi

if [ $STORAGE_ENABLED = "true" ]; then
	echo "** Starting storage enabled console **"
else
	echo "** Starting storage disabled console **"
fi

JAVA_OPTS="-Xms$MEMORY -Xmx$MEMORY -Dtangosol.coherence.distributed.localstorage=$STORAGE_ENABLED"

$JAVAEXEC -server -showversion $JAVA_OPTS -cp "$COHERENCE_HOME/config/:$COHERENCE_HOME/config/CoherenceObjects-1.0-SNAPSHOT.jar:$COHERENCE_HOME/config/RestLibs-1.0-SNAPSHOT.jar:$COHERENCE_HOME/lib/coherence.jar:$COHERENCE_HOME/lib/coherence-rest.jar:$JLINE_HOME/jline.jar" com.tangosol.coherence.dslquery.QueryPlus "$@"
