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
package griffon.swing.support.tangoicons;

import griffon.plugins.tangoicons.Tango;

import javax.annotation.Nonnull;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.net.URL;

import static griffon.plugins.tangoicons.Tango.invalidDescription;
import static griffon.plugins.tangoicons.Tango.requireValidSize;
import static griffon.util.GriffonNameUtils.requireNonBlank;
import static java.util.Objects.requireNonNull;

/**
 * @author Andres Almiray
 */
public class TangoIcon extends ImageIcon {
    private static final String ERROR_TANGO_NULL = "Argument 'tango' must not be null";
    private Tango tango;
    private int size;

    public TangoIcon() {
        this(Tango.findByDescription("apps:help-browser:16"));
    }

    public TangoIcon(@Nonnull Tango tango) {
        this(tango, 16);
    }

    public TangoIcon(@Nonnull Tango tango, int size) {
        super(toURL(tango, size));
        this.tango = requireNonNull(tango, ERROR_TANGO_NULL);
        this.size = size;
    }

    public TangoIcon(@Nonnull String description) {
        this(Tango.findByDescription(description));
        setTango(description);
    }

    @Nonnull
    private static URL toURL(@Nonnull Tango tango, int size) {
        requireNonNull(tango, ERROR_TANGO_NULL);
        String resource = tango.asResource(size);
        URL url = Thread.currentThread().getContextClassLoader().getResource(resource);
        if (url == null) {
            throw new IllegalArgumentException("Icon " + tango + " does not exist");
        }
        return url;
    }

    @Nonnull
    public Tango getTango() {
        return tango;
    }

    public void setTango(@Nonnull Tango tango) {
        this.tango = requireNonNull(tango, ERROR_TANGO_NULL);
        setImage(Toolkit.getDefaultToolkit().getImage(toURL(tango, size)));
    }

    public void setTango(@Nonnull String description) {
        requireNonBlank(description, "Argument 'description' must not be blank");

        String[] parts = description.split(":");
        if (parts.length == 3) {
            try {
                int s = Integer.parseInt(parts[2]);
                this.size = requireValidSize(s);
            } catch (NumberFormatException e) {
                throw invalidDescription(description, e);
            }
        } else if (size == 0) {
            size = 16;
        }

        tango = Tango.findByDescription(description);
        setImage(Toolkit.getDefaultToolkit().getImage(toURL(tango, size)));
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = requireValidSize(size);
        setImage(Toolkit.getDefaultToolkit().getImage(toURL(tango, size)));
    }
}