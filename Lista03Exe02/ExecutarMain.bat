@echo off
cd /d "%~dp0"
chcp 65001 > nul
javac *.java
java -Dfile.encoding=UTF-8 Lista03Exe02
pause
