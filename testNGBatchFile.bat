set projectLocation=C:\Users\Rivi\workspace\TestNGBatchExample
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testing.xml
pause