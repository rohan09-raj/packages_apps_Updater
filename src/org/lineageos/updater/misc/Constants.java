/*
 * Copyright (C) 2017 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.lineageos.updater.misc;

public final class Constants {

    private Constants() {
    }

    public static final String PREF_LAST_UPDATE_CHECK = "last_update_check";

    public static final String PROP_BUILD_DATE = "ro.build.date.utc";
    public static final String PROP_BUILD_VERSION = "ro.cm.build.version";
    public static final String PROP_BUILD_VERSION_INCREMENTAL = "ro.build.version.incremental";
    public static final String PROP_DEVICE = "ro.cm.device";
    public static final String PROP_RELEASE_TYPE = "ro.cm.releasetype";
    public static final String PROP_UPDATER_URI = "cm.updater.uri";

}
