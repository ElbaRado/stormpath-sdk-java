/*
 * Copyright 2016 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.impl.oauth;

import com.stormpath.sdk.impl.ds.InternalDataStore;
import com.stormpath.sdk.impl.resource.AbstractResource;
import com.stormpath.sdk.impl.resource.Property;
import com.stormpath.sdk.impl.resource.StringProperty;

import java.util.Map;

/**
 * @since 1.2.0
 */
public class DefaultOAuthStormpathTokenGrantAuthenticationAttempt extends AbstractResource implements OAuthStormpathTokenGrantAuthenticationAttempt {

    static final StringProperty GRANT_TYPE = new StringProperty("grant_type");
    static final StringProperty TOKEN = new StringProperty("token");

    private static final String STORMPATH_TOKEN = "stormpath_token";

    private static final Map<String, Property> PROPERTY_DESCRIPTORS = createPropertyDescriptorMap(GRANT_TYPE, TOKEN);

    public DefaultOAuthStormpathTokenGrantAuthenticationAttempt(InternalDataStore dataStore) {
        super(dataStore);
        setGrantType(STORMPATH_TOKEN);
    }

    public DefaultOAuthStormpathTokenGrantAuthenticationAttempt(InternalDataStore dataStore, Map<String, Object> properties) {
        super(dataStore, properties);
    }

    protected void setGrantType(String grantType) {
        setProperty(GRANT_TYPE, grantType);
    }

    @Override
    public void setToken(String token) {
        setProperty(TOKEN, token);
    }

    public String getGrantType() {
        return getString(GRANT_TYPE);
    }

    public String getToken() {
        return getString(TOKEN);
    }

    @Override
    public Map<String, Property> getPropertyDescriptors() {
        return PROPERTY_DESCRIPTORS;
    }
}
