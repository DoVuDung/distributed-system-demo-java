@ECHO OFF
cd C:\Users\Andy\He-phan-tan\Lab05_RMI\src
javac *.java 
rmic HelloImpl 
start rmiregistry
cls 
echo ===========================
echo cua so lam viec cua server
echo ver 1.0 - 23/08/2021
echo ===========================

java Hello
@pause
