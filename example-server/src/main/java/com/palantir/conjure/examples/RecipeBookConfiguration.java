/*
 * (c) Copyright 2018 Palantir Technologies Inc. All rights reserved.
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

package com.palantir.conjure.examples;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableSet;
import com.palantir.conjure.examples.recipes.api.Recipe;
import io.dropwizard.Configuration;
import java.util.List;
import java.util.Set;
import org.hibernate.validator.constraints.NotEmpty;

public final class RecipeBookConfiguration extends Configuration {

    @NotEmpty
    private Set<Recipe> recipes;

    @JsonProperty
    public Set<Recipe> getRecipes() {
        return recipes;
    }

    @JsonProperty
    public void setRecipes(List<Recipe> recipes) {
        this.recipes = ImmutableSet.copyOf(recipes);
    }
}