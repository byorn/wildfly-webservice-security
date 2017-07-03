/*
 * JBoss, Home of Professional Open Source
 * Copyright 2015, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package byorns.com.login.module;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.Principal;
import java.security.acl.Group;
import java.util.Map;
import java.util.Properties;

import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.login.LoginException;

import org.jboss.security.SimpleGroup;
import org.jboss.security.SimplePrincipal;
import org.jboss.security.auth.callback.ObjectCallback;
import org.jboss.security.auth.spi.AbstractServerLoginModule;
import org.jboss.security.auth.spi.UsernamePasswordLoginModule;

/**
 * Login module to make the decision if one user can ask for the current request to be switched to an alternative specified
 * user.
 *
 * @author <a href="mailto:darran.lofthouse@jboss.com">Darran Lofthouse</a>
 */
public class DelegationLoginModule extends UsernamePasswordLoginModule {

    private static final String DELEGATION_PROPERTIES = "delegationProperties";

    private static final String DEFAULT_DELEGATION_PROPERTIES = "delegation-mapping.properties";

    private Properties delegationMappings;

    private Principal identity;

    @Override
    public void initialize(Subject subject, CallbackHandler callbackHandler, Map<String, ?> sharedState, Map<String, ?> options) {

        super.initialize(subject, callbackHandler, sharedState, options);


    }


    protected String getUsersPassword() throws LoginException {

        // super.getUsername();
        // super.getUsersPassword

        /**
         * using super.getUsername(), and getUsersPassword, validate against a data source
         * jdbc, ldap or text file
         */

        //here if the password is byorn, authentication is sucesful.

        return "byorn";
    }

    protected Group[] getRoleSets() throws LoginException {

        /**
         *
         *  The Logged In User has the Role My Role.
         *
         *  See MyWebservice.java ..RolesAllowed.
         *
         */

        Group myrole = new SimpleGroup("Roles");

        SimplePrincipal role = new SimplePrincipal("myrole");
        Group[] groups = { myrole };
        myrole.addMember(role);
        return groups;
    }



}
