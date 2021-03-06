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

package org.jnosql.diana.hbase.column;

import org.jnosql.diana.api.column.ColumnConfiguration;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class HBaseColumnConfigurationTest {


    @Test
    public void shouldCreatesColumnFamilyManagerFactory() {
        ColumnConfiguration configuration = new HBaseColumnConfiguration();
        assertNotNull(configuration.get());
    }

    @Test
    public void shouldCreatesColumnFamilyManagerFactoryFromConfiguration() {
        ColumnConfiguration configuration = new HBaseColumnConfiguration();
        assertNotNull(configuration.get());
    }

    @Test(expected = NullPointerException.class)
    public void shouldReturnErrorCreatesColumnFamilyManagerFactory() {
        new HBaseColumnConfiguration(null);
    }
}