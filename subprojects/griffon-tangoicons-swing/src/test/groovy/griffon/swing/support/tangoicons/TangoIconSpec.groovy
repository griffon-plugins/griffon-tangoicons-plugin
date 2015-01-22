/*
 * Copyright 2014-2015 the original author or authors.
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
package griffon.swing.support.tangoicons

import griffon.plugins.tangoicons.Tango
import spock.lang.Specification

/**
 * @author Andres Almiray
 */
class TangoIconSpec extends Specification {
    def 'Can create a TangoIcon instance'() {
        given:
        Tango expected = Tango.ACTIONS_GO_UP

        expect:
        TangoIcon icon = new TangoIcon(expected)
        icon.tango == expected
        icon.size == 16
    }

    def 'Invalid TangoIcon arguments'() {
        when:
        new TangoIcon(arg)

        then:
        thrown(IllegalArgumentException)

        where:
        arg           | _
        null          | _
        ''            | _
        ' '           | _
        'foo'         | _
        'foo:foo'     | _
        'actions:foo' | _
    }
}
