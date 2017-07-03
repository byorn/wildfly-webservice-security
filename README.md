#How to Run

1) mvn clean install on the top level
2) standalone xml should have:

see blog: http://byorn.blogspot.com

login-module code="byorns.com.login.module.DelegationLoginModule" flag="required"
                            module-option name="password-stacking" value="useFirstPass"
                      login-module
                      
                      
3) in bin > standalone.bat

#Access the wsdl

http://localhost:8080/webservice-security/MyWebService?wsdl



In Soap UI, provide Auth Basic
the Password: should always be 'byorn' , never mind the user name.
Go through source code for more information.
