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
package griffon.swing.support.tangoicons;

import griffon.plugins.tangoicons.Tango;

import javax.annotation.Nonnull;
import javax.swing.ImageIcon;
import java.net.URL;

import static java.util.Objects.requireNonNull;

/**
 * @author Andres Almiray
 */
public class TangoIcon extends ImageIcon {
    private final Tango tango;
    private final int size;

    public TangoIcon(@Nonnull Tango tango) {
        this(tango, 16);
    }

    public TangoIcon(@Nonnull Tango tango, int size) {
        super(toURL(tango, size));
        this.tango = tango;
        this.size = size;
    }

    public TangoIcon(@Nonnull String description) {
        this(Tango.findByDescription(description));
    }

    @Nonnull
    private static URL toURL(@Nonnull Tango tango, int size) {
        requireNonNull(tango, "Argument 'tango' must not be null.");
        String resource = tango.asResource(size);
        URL url = Thread.currentThread().getContextClassLoader().getResource(resource);
        if (url == null) {
            throw new IllegalArgumentException("Icon " + tango.formatted() + " does not exist");
        }
        return url;
    }

    @Nonnull
    public Tango getTango() {
        return tango;
    }

    public int getSize() {
        return size;
    }
}
