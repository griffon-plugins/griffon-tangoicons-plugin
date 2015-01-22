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
package griffon.plugins.tangoicons;

import javax.annotation.Nonnull;

import static griffon.util.GriffonClassUtils.requireState;
import static griffon.util.GriffonNameUtils.isBlank;

/**
 * @author Andres Almiray
 */
public enum Tango {
    ACTIONS_ADDRESS_BOOK_NEW("actions", "address-book-new"),
    ACTIONS_APPOINTMENT_NEW("actions", "appointment-new"),
    ACTIONS_BOOKMARK_NEW("actions", "bookmark-new"),
    ACTIONS_CONTACT_NEW("actions", "contact-new"),
    ACTIONS_DOCUMENT_NEW("actions", "document-new"),
    ACTIONS_DOCUMENT_OPEN("actions", "document-open"),
    ACTIONS_DOCUMENT_PRINT_PREVIEW("actions", "document-print-preview"),
    ACTIONS_DOCUMENT_PRINT("actions", "document-print"),
    ACTIONS_DOCUMENT_PROPERTIES("actions", "document-properties"),
    ACTIONS_DOCUMENT_SAVE_AS("actions", "document-save-as"),
    ACTIONS_DOCUMENT_SAVE("actions", "document-save"),
    ACTIONS_EDIT_CLEAR("actions", "edit-clear"),
    ACTIONS_EDIT_COPY("actions", "edit-copy"),
    ACTIONS_EDIT_CUT("actions", "edit-cut"),
    ACTIONS_EDIT_DELETE("actions", "edit-delete"),
    ACTIONS_EDIT_FIND_REPLACE("actions", "edit-find-replace"),
    ACTIONS_EDIT_FIND("actions", "edit-find"),
    ACTIONS_EDIT_PASTE("actions", "edit-paste"),
    ACTIONS_EDIT_REDO("actions", "edit-redo"),
    ACTIONS_EDIT_SELECT_ALL("actions", "edit-select-all"),
    ACTIONS_EDIT_UNDO("actions", "edit-undo"),
    ACTIONS_FOLDER_NEW("actions", "folder-new"),
    ACTIONS_FORMAT_INDENT_LESS("actions", "format-indent-less"),
    ACTIONS_FORMAT_INDENT_MORE("actions", "format-indent-more"),
    ACTIONS_FORMAT_JUSTIFY_CENTER("actions", "format-justify-center"),
    ACTIONS_FORMAT_JUSTIFY_FILL("actions", "format-justify-fill"),
    ACTIONS_FORMAT_JUSTIFY_LEFT("actions", "format-justify-left"),
    ACTIONS_FORMAT_JUSTIFY_RIGHT("actions", "format-justify-right"),
    ACTIONS_FORMAT_TEXT_BOLD("actions", "format-text-bold"),
    ACTIONS_FORMAT_TEXT_ITALIC("actions", "format-text-italic"),
    ACTIONS_FORMAT_TEXT_STRIKETHROUGH("actions", "format-text-strikethrough"),
    ACTIONS_FORMAT_TEXT_UNDERLINE("actions", "format-text-underline"),
    ACTIONS_GO_BOTTOM("actions", "go-bottom"),
    ACTIONS_GO_DOWN("actions", "go-down"),
    ACTIONS_GO_FIRST("actions", "go-first"),
    ACTIONS_GO_HOME("actions", "go-home"),
    ACTIONS_GO_JUMP("actions", "go-jump"),
    ACTIONS_GO_LAST("actions", "go-last"),
    ACTIONS_GO_NEXT("actions", "go-next"),
    ACTIONS_GO_PREVIOUS("actions", "go-previous"),
    ACTIONS_GO_TOP("actions", "go-top"),
    ACTIONS_GO_UP("actions", "go-up"),
    ACTIONS_LIST_ADD("actions", "list-add"),
    ACTIONS_LIST_REMOVE("actions", "list-remove"),
    ACTIONS_MAIL_FORWARD("actions", "mail-forward"),
    ACTIONS_MAIL_MARK_JUNK("actions", "mail-mark-junk"),
    ACTIONS_MAIL_MARK_NOT_JUNK("actions", "mail-mark-not-junk"),
    ACTIONS_MAIL_MESSAGE_NEW("actions", "mail-message-new"),
    ACTIONS_MAIL_REPLY_ALL("actions", "mail-reply-all"),
    ACTIONS_MAIL_REPLY_SENDER("actions", "mail-reply-sender"),
    ACTIONS_MAIL_SEND_RECEIVE("actions", "mail-send-receive"),
    ACTIONS_MEDIA_EJECT("actions", "media-eject"),
    ACTIONS_MEDIA_PLAYBACK_PAUSE("actions", "media-playback-pause"),
    ACTIONS_MEDIA_PLAYBACK_START("actions", "media-playback-start"),
    ACTIONS_MEDIA_PLAYBACK_STOP("actions", "media-playback-stop"),
    ACTIONS_MEDIA_RECORD("actions", "media-record"),
    ACTIONS_MEDIA_SEEK_BACKWARD("actions", "media-seek-backward"),
    ACTIONS_MEDIA_SEEK_FORWARD("actions", "media-seek-forward"),
    ACTIONS_MEDIA_SKIP_BACKWARD("actions", "media-skip-backward"),
    ACTIONS_MEDIA_SKIP_FORWARD("actions", "media-skip-forward"),
    ACTIONS_PROCESS_STOP("actions", "process-stop"),
    ACTIONS_SYSTEM_LOCK_SCREEN("actions", "system-lock-screen"),
    ACTIONS_SYSTEM_LOG_OUT("actions", "system-log-out"),
    ACTIONS_SYSTEM_SEARCH("actions", "system-search"),
    ACTIONS_SYSTEM_SHUTDOWN("actions", "system-shutdown"),
    ACTIONS_TAB_NEW("actions", "tab-new"),
    ACTIONS_VIEW_FULLSCREEN("actions", "view-fullscreen"),
    ACTIONS_VIEW_REFRESH("actions", "view-refresh"),
    ACTIONS_WINDOW_NEW("actions", "window-new"),
    APPS_ACCESSORIES_CALCULATOR("apps", "accessories-calculator"),
    APPS_ACCESSORIES_CHARACTER_MAP("apps", "accessories-character-map"),
    APPS_ACCESSORIES_TEXT_EDITOR("apps", "accessories-text-editor"),
    APPS_HELP_BROWSER("apps", "help-browser"),
    APPS_INTERNET_GROUP_CHAT("apps", "internet-group-chat"),
    APPS_INTERNET_MAIL("apps", "internet-mail"),
    APPS_INTERNET_NEWS_READER("apps", "internet-news-reader"),
    APPS_INTERNET_WEB_BROWSER("apps", "internet-web-browser"),
    APPS_OFFICE_CALENDAR("apps", "office-calendar"),
    APPS_PREFERENCES_DESKTOP_ACCESSIBILITY("apps", "preferences-desktop-accessibility"),
    APPS_PREFERENCES_DESKTOP_ASSISTIVE_TECHNOLOGY("apps", "preferences-desktop-assistive-technology"),
    APPS_PREFERENCES_DESKTOP_FONT("apps", "preferences-desktop-font"),
    APPS_PREFERENCES_DESKTOP_KEYBOARD_SHORTCUTS("apps", "preferences-desktop-keyboard-shortcuts"),
    APPS_PREFERENCES_DESKTOP_LOCALE("apps", "preferences-desktop-locale"),
    APPS_PREFERENCES_DESKTOP_MULTIMEDIA("apps", "preferences-desktop-multimedia"),
    APPS_PREFERENCES_DESKTOP_REMOTE_DESKTOP("apps", "preferences-desktop-remote-desktop"),
    APPS_PREFERENCES_DESKTOP_SCREENSAVER("apps", "preferences-desktop-screensaver"),
    APPS_PREFERENCES_DESKTOP_THEME("apps", "preferences-desktop-theme"),
    APPS_PREFERENCES_DESKTOP_WALLPAPER("apps", "preferences-desktop-wallpaper"),
    APPS_PREFERENCES_SYSTEM_NETWORK_PROXY("apps", "preferences-system-network-proxy"),
    APPS_PREFERENCES_SYSTEM_SESSION("apps", "preferences-system-session"),
    APPS_PREFERENCES_SYSTEM_WINDOWS("apps", "preferences-system-windows"),
    APPS_SYSTEM_FILE_MANAGER("apps", "system-file-manager"),
    APPS_SYSTEM_INSTALLER("apps", "system-installer"),
    APPS_SYSTEM_SOFTWARE_UPDATE("apps", "system-software-update"),
    APPS_SYSTEM_USERS("apps", "system-users"),
    APPS_UTILITIES_SYSTEM_MONITOR("apps", "utilities-system-monitor"),
    APPS_UTILITIES_TERMINAL("apps", "utilities-terminal"),
    CATEGORIES_APPLICATIONS_ACCESSORIES("categories", "applications-accessories"),
    CATEGORIES_APPLICATIONS_DEVELOPMENT("categories", "applications-development"),
    CATEGORIES_APPLICATIONS_GAMES("categories", "applications-games"),
    CATEGORIES_APPLICATIONS_GRAPHICS("categories", "applications-graphics"),
    CATEGORIES_APPLICATIONS_INTERNET("categories", "applications-internet"),
    CATEGORIES_APPLICATIONS_MULTIMEDIA("categories", "applications-multimedia"),
    CATEGORIES_APPLICATIONS_OFFICE("categories", "applications-office"),
    CATEGORIES_APPLICATIONS_OTHER("categories", "applications-other"),
    CATEGORIES_APPLICATIONS_SYSTEM("categories", "applications-system"),
    CATEGORIES_PREFERENCES_DESKTOP_PERIPHERALS("categories", "preferences-desktop-peripherals"),
    CATEGORIES_PREFERENCES_DESKTOP("categories", "preferences-desktop"),
    CATEGORIES_PREFERENCES_SYSTEM("categories", "preferences-system"),
    DEVICES_AUDIO_CARD("devices", "audio-card"),
    DEVICES_AUDIO_INPUT_MICROPHONE("devices", "audio-input-microphone"),
    DEVICES_BATTERY("devices", "battery"),
    DEVICES_CAMERA_PHOTO("devices", "camera-photo"),
    DEVICES_CAMERA_VIDEO("devices", "camera-video"),
    DEVICES_COMPUTER("devices", "computer"),
    DEVICES_DRIVE_HARDDISK("devices", "drive-harddisk"),
    DEVICES_DRIVE_OPTICAL("devices", "drive-optical"),
    DEVICES_DRIVE_REMOVABLE_MEDIA("devices", "drive-removable-media"),
    DEVICES_INPUT_GAMING("devices", "input-gaming"),
    DEVICES_INPUT_KEYBOARD("devices", "input-keyboard"),
    DEVICES_INPUT_MOUSE("devices", "input-mouse"),
    DEVICES_MEDIA_FLASH("devices", "media-flash"),
    DEVICES_MEDIA_FLOPPY("devices", "media-floppy"),
    DEVICES_MEDIA_OPTICAL("devices", "media-optical"),
    DEVICES_MULTIMEDIA_PLAYER("devices", "multimedia-player"),
    DEVICES_NETWORK_WIRED("devices", "network-wired"),
    DEVICES_NETWORK_WIRELESS("devices", "network-wireless"),
    DEVICES_PRINTER("devices", "printer"),
    DEVICES_VIDEO_DISPLAY("devices", "video-display"),
    EMBLEMS_EMBLEM_FAVORITE("emblems", "emblem-favorite"),
    EMBLEMS_EMBLEM_IMPORTANT("emblems", "emblem-important"),
    EMBLEMS_EMBLEM_PHOTOS("emblems", "emblem-photos"),
    EMBLEMS_EMBLEM_READONLY("emblems", "emblem-readonly"),
    EMBLEMS_EMBLEM_SYMBOLIC_LINK("emblems", "emblem-symbolic-link"),
    EMBLEMS_EMBLEM_SYSTEM("emblems", "emblem-system"),
    EMBLEMS_EMBLEM_UNREADABLE("emblems", "emblem-unreadable"),
    EMOTES_FACE_ANGEL("emotes", "face-angel"),
    EMOTES_FACE_CRYING("emotes", "face-crying"),
    EMOTES_FACE_DEVILISH("emotes", "face-devilish"),
    EMOTES_FACE_GLASSES("emotes", "face-glasses"),
    EMOTES_FACE_GRIN("emotes", "face-grin"),
    EMOTES_FACE_KISS("emotes", "face-kiss"),
    EMOTES_FACE_MONKEY("emotes", "face-monkey"),
    EMOTES_FACE_PLAIN("emotes", "face-plain"),
    EMOTES_FACE_SAD("emotes", "face-sad"),
    EMOTES_FACE_SMILE_BIG("emotes", "face-smile-big"),
    EMOTES_FACE_SMILE("emotes", "face-smile"),
    EMOTES_FACE_SURPRISE("emotes", "face-surprise"),
    EMOTES_FACE_WINK("emotes", "face-wink"),
    MIMETYPES_APPLICATION_CERTIFICATE("mimetypes", "application-certificate"),
    MIMETYPES_APPLICATION_X_EXECUTABLE("mimetypes", "application-x-executable"),
    MIMETYPES_AUDIO_X_GENERIC("mimetypes", "audio-x-generic"),
    MIMETYPES_FONT_X_GENERIC("mimetypes", "font-x-generic"),
    MIMETYPES_IMAGE_X_GENERIC("mimetypes", "image-x-generic"),
    MIMETYPES_PACKAGE_X_GENERIC("mimetypes", "package-x-generic"),
    MIMETYPES_TEXT_HTML("mimetypes", "text-html"),
    MIMETYPES_TEXT_X_GENERIC_TEMPLATE("mimetypes", "text-x-generic-template"),
    MIMETYPES_TEXT_X_GENERIC("mimetypes", "text-x-generic"),
    MIMETYPES_TEXT_X_SCRIPT("mimetypes", "text-x-script"),
    MIMETYPES_VIDEO_X_GENERIC("mimetypes", "video-x-generic"),
    MIMETYPES_X_OFFICE_ADDRESS_BOOK("mimetypes", "x-office-address-book"),
    MIMETYPES_X_OFFICE_CALENDAR("mimetypes", "x-office-calendar"),
    MIMETYPES_X_OFFICE_DOCUMENT_TEMPLATE("mimetypes", "x-office-document-template"),
    MIMETYPES_X_OFFICE_DOCUMENT("mimetypes", "x-office-document"),
    MIMETYPES_X_OFFICE_DRAWING_TEMPLATE("mimetypes", "x-office-drawing-template"),
    MIMETYPES_X_OFFICE_DRAWING("mimetypes", "x-office-drawing"),
    MIMETYPES_X_OFFICE_PRESENTATION_TEMPLATE("mimetypes", "x-office-presentation-template"),
    MIMETYPES_X_OFFICE_PRESENTATION("mimetypes", "x-office-presentation"),
    MIMETYPES_X_OFFICE_SPREADSHEET_TEMPLATE("mimetypes", "x-office-spreadsheet-template"),
    MIMETYPES_X_OFFICE_SPREADSHEET("mimetypes", "x-office-spreadsheet"),
    PLACES_FOLDER_REMOTE("places", "folder-remote"),
    PLACES_FOLDER_SAVED_SEARCH("places", "folder-saved-search"),
    PLACES_FOLDER("places", "folder"),
    PLACES_NETWORK_SERVER("places", "network-server"),
    PLACES_NETWORK_WORKGROUP("places", "network-workgroup"),
    PLACES_START_HERE("places", "start-here"),
    PLACES_USER_DESKTOP("places", "user-desktop"),
    PLACES_USER_HOME("places", "user-home"),
    PLACES_USER_TRASH("places", "user-trash"),
    STATUS_AUDIO_VOLUME_HIGH("status", "audio-volume-high"),
    STATUS_AUDIO_VOLUME_LOW("status", "audio-volume-low"),
    STATUS_AUDIO_VOLUME_MEDIUM("status", "audio-volume-medium"),
    STATUS_AUDIO_VOLUME_MUTED("status", "audio-volume-muted"),
    STATUS_BATTERY_CAUTION("status", "battery-caution"),
    STATUS_DIALOG_ERROR("status", "dialog-error"),
    STATUS_DIALOG_INFORMATION("status", "dialog-information"),
    STATUS_DIALOG_WARNING("status", "dialog-warning"),
    STATUS_FOLDER_DRAG_ACCEPT("status", "folder-drag-accept"),
    STATUS_FOLDER_OPEN("status", "folder-open"),
    STATUS_FOLDER_VISITING("status", "folder-visiting"),
    STATUS_IMAGE_LOADING("status", "image-loading"),
    STATUS_IMAGE_MISSING("status", "image-missing"),
    STATUS_MAIL_ATTACHMENT("status", "mail-attachment"),
    STATUS_NETWORK_ERROR("status", "network-error"),
    STATUS_NETWORK_IDLE("status", "network-idle"),
    STATUS_NETWORK_OFFLINE("status", "network-offline"),
    STATUS_NETWORK_RECEIVE("status", "network-receive"),
    STATUS_NETWORK_TRANSMIT_RECEIVE("status", "network-transmit-receive"),
    STATUS_NETWORK_TRANSMIT("status", "network-transmit"),
    STATUS_NETWORK_WIRELESS_ENCRYPTED("status", "network-wireless-encrypted"),
    STATUS_PRINTER_ERROR("status", "printer-error"),
    STATUS_SOFTWARE_UPDATE_AVAILABLE("status", "software-update-available"),
    STATUS_SOFTWARE_UPDATE_URGENT("status", "software-update-urgent"),
    STATUS_USER_TRASH_FULL("status", "user-trash-full"),
    STATUS_WEATHER_CLEAR_NIGHT("status", "weather-clear-night"),
    STATUS_WEATHER_CLEAR("status", "weather-clear"),
    STATUS_WEATHER_FEW_CLOUDS_NIGHT("status", "weather-few-clouds-night"),
    STATUS_WEATHER_FEW_CLOUDS("status", "weather-few-clouds"),
    STATUS_WEATHER_OVERCAST("status", "weather-overcast"),
    STATUS_WEATHER_SEVERE_ALERT("status", "weather-severe-alert"),
    STATUS_WEATHER_SHOWERS_SCATTERED("status", "weather-showers-scattered"),
    STATUS_WEATHER_SHOWERS("status", "weather-showers"),
    STATUS_WEATHER_SNOW("status", "weather-snow"),
    STATUS_WEATHER_STORM("status", "weather-storm");

    private final String category;
    private final String description;

    Tango(@Nonnull String category, @Nonnull String description) {
        this.category = category;
        this.description = description;
    }

    @Nonnull
    public String getCategory() {
        return category;
    }

    @Nonnull
    public String getDescription() {
        return description;
    }

    @Nonnull
    public String formatted() {
        return category + ":" + description;
    }

    @Nonnull
    public String asResource(int size) {
        requireState(size == 16 || size == 22 || size == 32, "Argument 'size' must be one of [16, 22, 32].");
        return "org/freedesktop/tango/" + size + "x" + size + "/" + category + "/" + description + ".png";
    }

    @Nonnull
    public static Tango findByDescription(@Nonnull String description) {
        if (isBlank(description)) {
            throw new IllegalArgumentException("Description " + description + " is not a valid Tango icon description");
        }
        if (!description.contains(":")) {
            throw new IllegalArgumentException("Description " + description + " is not a valid Tango icon description");
        }

        String[] parts = description.split(":");

        for (Tango tango : values()) {
            if (tango.category.equalsIgnoreCase(parts[0]) && tango.description.equalsIgnoreCase(parts[1])) {
                return tango;
            }
        }
        throw new IllegalArgumentException("Description " + description + " is not a a valid Tango icon description");
    }
}
