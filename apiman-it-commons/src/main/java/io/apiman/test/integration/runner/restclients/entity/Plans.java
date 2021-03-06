/*
 * Copyright 2016 Red Hat Inc.
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

package io.apiman.test.integration.runner.restclients.entity;

import io.apiman.test.integration.runner.restclients.AbstractEntityRestClient;
import io.apiman.manager.api.beans.orgs.OrganizationBean;
import io.apiman.manager.api.beans.plans.NewPlanBean;
import io.apiman.manager.api.beans.plans.PlanBean;

/**
 * @author jcechace
 */
public class Plans extends AbstractEntityRestClient<PlanBean, NewPlanBean> {

    public static final String RESOURCE_PATH = "/organizations/{0}/plans";

    public Plans(OrganizationBean org) {
        super(path(RESOURCE_PATH, org.getId()), PlanBean.class);
    }
}
