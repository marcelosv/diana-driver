/*
 * Copyright 2017 Otavio Santana and others
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
 *
 *
 */
package org.jnosql.diana.couchbase.document;

import org.jnosql.diana.api.document.DocumentCollectionManagerFactory;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class CouchbaseDocumentConfigurationTest {

    @Test
    public void shouldCreateDocumentCollectionManagerFactoryByMap() {

        CouchbaseDocumentConfiguration configuration = new CouchbaseDocumentConfiguration();
        DocumentCollectionManagerFactory managerFactory = configuration.get();
        assertNotNull(managerFactory);
    }

    @Test
    public void shouldCreateDocumentCollectionManagerFactoryByFile() {
        CouchbaseDocumentConfiguration configuration = new CouchbaseDocumentConfiguration();
        DocumentCollectionManagerFactory managerFactory = configuration.get();
        assertNotNull(managerFactory);
    }
}