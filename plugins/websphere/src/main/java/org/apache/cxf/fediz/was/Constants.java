/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.fediz.was;


/**
 * Constants used by the FedizInterceptor or SecurityContextTTLChecker classes
 */
//CHECKSTYLE:OFF
public interface Constants {
    
    String HTTP_POST_METHOD = "POST";
    //String UTF_8_ENCODING_SCHEME = "UTF-8";
    String VERSION = "1.2.0";
    String TIMESTAMP_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    
    String USER_REGISTRY_JNDI_NAME = "UserRegistry";

    String SUBJECT_TOKEN_KEY = "_security.token";
    String SUBJECT_SESSION_ATTRIBUTE_KEY = "_tai.subject";
    String SECURITY_TOKEN_SESSION_ATTRIBUTE_KEY = "fediz.security.token";

    /**
     * @deprecated Use PROPERTY_KEY_CONFIG_LOCATION instead.
     *
     * Using this property causes problems on Websphere 8.5. See https://issues.apache.org/jira/browse/FEDIZ-97 for more
     * details.
     */
    @Deprecated
    String CONFIGURATION_FILE_PARAMETER = "config.file.location";
    /**
     * This constant contains the name for the property to discover the location of the fediz configuration file.
     */
    String PROPERTY_KEY_CONFIG_LOCATION = "fedizConfigFileLocation";

    /**
     * @deprecated Use PROPERTY_KEY_ROLE_MAPPER instead.
     */
    @Deprecated
    String ROLE_GROUP_MAPPER = "role.group.mapper";

    /**
     * This constant contains the name for the property to discover the class-name which should be used for role to
     * group mappings.
     */
    String PROPERTY_KEY_ROLE_MAPPER = "roleMapper";

    /**
     * Usually the group name is mapped to the GroupUID by using the User Registry. In the WAS liberty profile there
     * is no User Registry available via JNDI, thus the GroupUID mapping needs to take place directly in the
     * Claim2Group Mapper. By using this interceptor property and setting the value to 'true' the UserRegistry will
     * not be used to get the GroupUID but instead the GroupUID needs to be provided by the Claim2Group Mapper. The
     * default value is set to 'false', thus the UserRegistry will be invoked.
     */
    String PROPERTY_KEY_DIRECT_GROUP_MAPPING = "directGroupMapping";
    
    /**
     * The session cookie name can be renamed in WebSphere. If it is renames, it is required to change it in the
     * interceptor configuration too. A missconfiguration would lead to performance loss.
     */
    String PROPERTY_SESSION_COOKIE_NAME = "sessionCookieName";
    
    /**
     * Default name of the session cookie in wbesphere
     */
    String SESSION_COOKIE_DEFAULT_NAME = "LtpaToken2";
}
