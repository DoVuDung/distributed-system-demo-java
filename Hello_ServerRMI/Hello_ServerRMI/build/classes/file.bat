
@echo off
cd C:\Users\Andy\He-phan-tan\Hello_ServerRMI\Hello_ServerRMI\src
javac *.java
rmic HelloImpl
start rmiregistry
cls
java Hello_Server
ECHO --------------------------------------------------------
ECHO         demo demo demo
ECHO ---------------------------------------------------------
@PAUSE