/*-
 * #%L
 * Quarkus-sampler
 * %%
 * Copyright (C) 2024 i-Cell Mobilsoft Zrt.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package hu.icellmobilsoft.quarkus.sampler.rest.restclient.provider;

import jakarta.enterprise.context.Dependent;
import jakarta.json.bind.Jsonb;
import jakarta.ws.rs.ext.ContextResolver;

import hu.icellmobilsoft.quarkus.sampler.rest.provider.util.JsonbUtil;

/**
 * Custom default JSON-B JAXRS provider. For MP-rest client
 *
 * @author speter555
 * @see <a href=
 *      "https://download.eclipse.org/microprofile/microprofile-rest-client-2.0/microprofile-rest-client-spec-2.0.html#_json_p_and_json_b_providers">MP
 *      Rest client 2.0 spec JSON-B provider</a>
 * @since 0.1.0
 */
@Dependent
public class CustomJsonbContextResolver implements ContextResolver<Jsonb> {

    /**
     * Default constructor
     */
    public CustomJsonbContextResolver() {
        // Default constructor for java 21
    }

    @Override
    public Jsonb getContext(Class<?> type) {
        return JsonbUtil.getContext();
    }
}
