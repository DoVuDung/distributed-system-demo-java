@echo off
cd C:\Users\Andy\He-phan-tan\demohuy\src
javac *.java
rmic PrintImpl
start rmiregistry
@PAUSE
java PrintRMI
ECHO --------------------------------------------------------
ECHO        hello huy hello huy hello huy
ECHO ---------------------------------------------------------
@PAUSE