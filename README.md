#How to Run

1) mvn clean install on the top level
2) standalone xml should have the login module defined:

see blog: http://byorn.blogspot.com
                  
                      
3) in bin > standalone.bat

#Access the wsdl

http://localhost:8080/webservice-security/MyWebService?wsdl



In Soap UI, provide Auth Basic
the Password: should always be 'byorn' , never mind the user name.
Go through source code for more information.
