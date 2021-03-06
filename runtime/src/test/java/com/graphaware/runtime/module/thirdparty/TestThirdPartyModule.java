/*
 * Copyright (c) 2013-2016 GraphAware
 *
 * This file is part of the GraphAware Framework.
 *
 * GraphAware Framework is free software: you can redistribute it and/or modify it under the terms of
 * the GNU General Public License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details. You should have received a copy of
 * the GNU General Public License along with this program.  If not, see
 * <http://www.gnu.org/licenses/>.
 */

package com.graphaware.runtime.module.thirdparty;

import com.graphaware.writer.thirdparty.WriteOperation;

import java.util.Collection;

/**
 * A {@link ThirdPartyIntegrationModule} for testing.
 */
public class TestThirdPartyModule extends ThirdPartyIntegrationModule {

    private Collection<WriteOperation<?>> writeOperations;

    public TestThirdPartyModule(String moduleId) {
        super(moduleId);
    }

    @Override
    public void afterCommit(Collection<WriteOperation<?>> state) {
        super.afterCommit(state);
        writeOperations = state;
    }

    public Collection<WriteOperation<?>> getWriteOperations() {
        return writeOperations;
    }
}
