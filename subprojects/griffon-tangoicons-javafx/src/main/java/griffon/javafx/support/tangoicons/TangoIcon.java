/*
 * Copyright 2014-2017 the original author or authors.
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
package griffon.javafx.support.tangoicons;

import griffon.plugins.tangoicons.Tango;
import javafx.scene.image.Image;

import javax.annotation.Nonnull;
import java.net.URL;

import static griffon.plugins.tangoicons.Tango.invalidDescription;
import static griffon.util.GriffonNameUtils.requireNonBlank;
import static java.util.Objects.requireNonNull;

/**
 * @author Andres Almiray
 */
public class TangoIcon extends Image {
    private static final String ERROR_TANGO_NULL = "Argument 'tango' must not be null.";
    private Tango tango;
    private int size;

    public TangoIcon(@Nonnull Tango tango) {
        this(tango, 16);
    }

    public TangoIcon(@Nonnull Tango tango, int size) {
        super(toURL(tango, size), true);
        this.tango = requireNonNull(tango, ERROR_TANGO_NULL);
        this.size = size;
    }

    public TangoIcon(@Nonnull String description) {
        super(toURL(description));
        tango = Tango.findByDescription(description);

        String[] parts = description.split(":");
        if (parts.length == 3) {
            try {
                size = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                throw invalidDescription(description, e);
            }
        } else {
            size = 16;
        }
    }

    @Nonnull
    private static String toURL(@Nonnull Tango tango, int size) {
        requireNonNull(tango, ERROR_TANGO_NULL);
        String resource = tango.asResource(size);
        URL url = Thread.currentThread().getContextClassLoader().getResource(resource);
        if (url == null) {
            throw new IllegalArgumentException("Icon " + tango + ":" + size + " does not exist");
        }
        return url.toExternalForm();
    }

    @Nonnull
    private static String toURL(@Nonnull String description) {
        requireNonBlank(description, "Argument 'description' must not be blank");
        String resource = Tango.asResource(description);
        URL url = Thread.currentThread().getContextClassLoader().getResource(resource);
        if (url == null) {
            throw new IllegalArgumentException("Icon " + description + " does not exist");
        }
        return url.toExternalForm();
    }

    @Nonnull
    public Tango getTango() {
        return tango;
    }

    public int getSize() {
        return size;
    }
}