#!/usr/bin/env bash

#clean fbsimctl session
if [ $# -lt 1 ]
then
  echo "Missing argument：procedure_name"
  exit 1
fi

PROCESS=`ps -ef|grep $1|grep -v grep|grep -v PPID|awk '{ print $2}'`
for i in $PROCESS
do
  echo "Kill the $1 process [ $i ]"
  kill -9 $i
done

#clean old report
rm -fr report
