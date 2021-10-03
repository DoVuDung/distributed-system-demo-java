@echo off
cd C:\Users\Andy\He-phan-tan\HaNoiRMI\src
javac *.java
rmic HanoiImpl
rmic TimeImpl
rmic RateServerImpl
start rmiregistry
cls
java Hanoi_RMI
ECHO --------------------------------------------------------
ECHO            SAN CHUNG KHOAN TAI HA NOI
ECHO     ĐC: 123 Le Thanh Ton, Quan Hoan Kiem, Ha Noi           
ECHO     ĐT: xxxxxxxxxXXXX , Email: HanoiCK.gmail.com
ECHO ---------------------------------------------------------
@PAUSE

