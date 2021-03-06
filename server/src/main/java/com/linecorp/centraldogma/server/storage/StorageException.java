/*
 * Copyright 2017 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.linecorp.centraldogma.server.storage;

/**
 * A {@link RuntimeException} that is raised when a potentially irrecoverable storage access failure has
 * occurred.
 */
public class StorageException extends RuntimeException {
    private static final long serialVersionUID = -1863726420582803362L;

    /**
     * Creates a new instance.
     */
    public StorageException() {}

    /**
     * Creates a new instance with the specified {@code message}.
     */
    public StorageException(String message) {
        super(message);
    }

    /**
     * Creates a new instance with the specified {@code cause}.
     */
    public StorageException(Throwable cause) {
        super(cause);
    }

    /**
     * Creates a new instance with the specified {@code message} and {@code cause}.
     */
    public StorageException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Creates a new instance with the specified {@code message}, {@code cause}, suppression enabled or
     * disabled, and writable stack trace enabled or disabled.
     */
    protected StorageException(String message, Throwable cause,
                               boolean enableSuppression, boolean writableStackTrace) {

        super(message, cause, enableSuppression, writableStackTrace);
    }
}
