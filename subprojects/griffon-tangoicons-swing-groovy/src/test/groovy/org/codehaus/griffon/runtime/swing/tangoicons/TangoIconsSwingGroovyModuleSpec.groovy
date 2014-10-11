/*
 * Copyright 2014 the original author or authors.
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
package org.codehaus.griffon.runtime.swing.tangoicons

import griffon.builder.swing.factory.TangoIconFactory
import griffon.core.GriffonApplication
import griffon.core.test.GriffonUnitRule
import griffon.plugins.tangoicons.Tango
import griffon.swing.support.tangoicons.TangoIcon
import griffon.util.BuilderCustomizer
import griffon.util.CompositeBuilder
import org.junit.Rule
import spock.lang.Specification
import spock.lang.Unroll

import javax.annotation.Nonnull
import javax.inject.Inject

import static griffon.util.AnnotationUtils.sortByDependencies

/**
 * @author Andres Almiray
 */
class TangoIconsSwingGroovyModuleSpec extends Specification {
    @Rule
    public final GriffonUnitRule griffon = new GriffonUnitRule()

    @Inject
    private GriffonApplication application

    def 'Builder customizer is configured correctly'() {
        when:
        FactoryBuilderSupport builder = createBuilder(application)

        then:
        builder.factories.containsKey('tangoIcon')
        builder.factories.tangoIcon.class == TangoIconFactory
    }

    @Unroll
    def 'Can create a TangoIcon using the factory'() {
        given:
        FactoryBuilderSupport builder = createBuilder(application)

        when:
        TangoIcon icon = builder.tangoIcon(value, icon: tango)

        then:
        icon.tango == expected

        where:
        value               | tango               || expected
        Tango.ACTIONS_GO_UP | null                || Tango.ACTIONS_GO_UP
        null                | Tango.ACTIONS_GO_UP || Tango.ACTIONS_GO_UP
        null                | 'ACTIONS:GO-UP'     || Tango.ACTIONS_GO_UP
    }

    private static final String BUILDER_CUSTOMIZER = 'BuilderCustomizer'

    @Nonnull
    protected FactoryBuilderSupport createBuilder(@Nonnull GriffonApplication application) {
        Collection<BuilderCustomizer> customizers = resolveBuilderCustomizers(application)
        return new CompositeBuilder(customizers.toArray(new BuilderCustomizer[customizers.size()]))
    }

    @Nonnull
    private Collection<BuilderCustomizer> resolveBuilderCustomizers(@Nonnull GriffonApplication application) {
        Collection<BuilderCustomizer> customizerInstances = application.injector.getInstances(BuilderCustomizer)
        return sortByDependencies(customizerInstances, BUILDER_CUSTOMIZER, 'customizer').values()
    }
}
