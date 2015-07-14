package com.stormpath.sdk.impl.tenant;/*
* Copyright 2015 Stormpath, Inc.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

import com.stormpath.sdk.impl.query.DefaultCriteria;
import com.stormpath.sdk.tenant.TenantCriteria;
import com.stormpath.sdk.tenant.TenantOptions;

/**
 * @since 1.0.RC4.6
 */
public class DefaultTenantCriteria extends DefaultCriteria<TenantCriteria, TenantOptions> implements TenantCriteria {

    public DefaultTenantCriteria() {
        super(new DefaultTenantOptions());
    }

    public DefaultTenantCriteria(TenantOptions tenantOptions) {
        super(tenantOptions);
    }

    @Override
    public TenantCriteria withApplications() {
        getOptions().withApplications();
        return this;
    }

    @Override
    public TenantCriteria withApplications(int limit) {
        getOptions().withApplications(limit);
        return this;
    }

    @Override
    public TenantCriteria withApplications(int limit, int offset) {
        getOptions().withApplications(limit, offset);
        return this;
    }

    @Override
    public TenantCriteria withDirectories() {
        getOptions().withDirectories();
        return this;
    }

    @Override
    public TenantCriteria withDirectories(int limit) {
        getOptions().withDirectories(limit);
        return this;
    }

    @Override
    public TenantCriteria withDirectories(int limit, int offset) {
        getOptions().withDirectories(limit, offset);
        return this;
    }

    @Override
    public TenantCriteria withCustomData() {
        getOptions().withCustomData();
        return this;
    }
}
