@echo off
cd 
@echo Bien dich ra Class
javac *.java
@echo Dich ra stub
rmic CalculatorImpl
@echo Dang ky rmi
start rmiregistry
@echo ok
@pause
