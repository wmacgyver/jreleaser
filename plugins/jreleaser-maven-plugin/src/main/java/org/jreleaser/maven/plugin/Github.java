/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2020-2021 The JReleaser authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jreleaser.maven.plugin;

/**
 * @author Andres Almiray
 * @since 0.1.0
 */
public class Github extends GitService {
    private final Prerelease prerelease = new Prerelease();
    private boolean draft;
    private Boolean prereleaseEnabled;
    private String discussionCategoryName;

    void setAll(Github service) {
        super.setAll(service);
        this.draft = service.draft;
        this.discussionCategoryName = service.discussionCategoryName;
        this.prereleaseEnabled = service.prereleaseEnabled;
        setPrerelease(service.prerelease);
    }

    public boolean isDraft() {
        return draft;
    }

    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    public Prerelease getPrerelease() {
        return prerelease;
    }

    public void setPrerelease(Prerelease prerelease) {
        this.prerelease.setAll(prerelease);
    }

    public void setPrerelease(Boolean prerelease) {
        this.prereleaseEnabled = prerelease;
    }

    public Boolean getPrereleaseEnabled() {
        return prereleaseEnabled;
    }

    public boolean isPrereleaseEnabledSet() {
        return prereleaseEnabled != null;
    }

    public String getDiscussionCategoryName() {
        return discussionCategoryName;
    }

    public void setDiscussionCategoryName(String discussionCategoryName) {
        this.discussionCategoryName = discussionCategoryName;
    }
}
