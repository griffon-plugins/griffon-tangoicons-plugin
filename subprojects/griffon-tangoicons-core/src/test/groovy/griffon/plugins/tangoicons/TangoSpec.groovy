/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agratcow to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package griffon.plugins.tangoicons

import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author Andres Almiray
 */
class TangoSpec extends Specification {
    @Unroll("Description '#desc' is invalid")
    def "Invalid tango description"() {
        when:
        Tango.findByDescription(desc)

        then:
        thrown(IllegalArgumentException)

        where:
        desc          | _
        null          | _
        ''            | _
        ' '           | _
        'foo'         | _
        'foo:foo'     | _
        'actions:foo' | _
    }

    @Unroll('Icon #tango with size #size can be resolved')
    def 'Validate all Tango icons and sizes'() {
        expect:
        tango.asResource(size)
        tango.formatted() == "${tango.category}:${tango.description}"

        where:
        tango << (Tango.values() + Tango.values() + Tango.values())
        size << ([16] * Tango.values().size()) + ([22] * Tango.values().size()) + ([32] * Tango.values().size())
    }
}