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

package io.apiman.test.integration.ui.support.selenide.pages.policies;

import static com.codeborne.selenide.Selenide.$;

import io.apiman.test.integration.ui.support.selenide.layouts.AbstractAddPolicyPage;

import com.codeborne.selenide.SelenideElement;

/**
 * @author opontes
 */
public class AddTransformationPolicyPage extends AbstractAddPolicyPage<AddTransformationPolicyPage>{

    public SelenideElement clientDataFormat(){
        return $("select[name=\"root[clientFormat]\"]");
    }

    public SelenideElement serverDataFormat(){
        return $("select[name=\"root[serverFormat]\"]");
    }

    public AddTransformationPolicyPage configure(String client, String server){
        clientDataFormat().selectOptionByValue(client);
        serverDataFormat().selectOptionByValue(server);
        return thisPageObject();
    }

    @Override
    public AddTransformationPolicyPage selectPolicyType() {
        return policyType("Transformation Policy");
    }
}
