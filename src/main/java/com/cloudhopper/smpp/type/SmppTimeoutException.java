/**
 * Copyright (C) 2011 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
 * file except in compliance with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.cloudhopper.smpp.type;

/**
 * Thrown specifically when an operation times out vs. some sort of underlying
 * I/O exception like the channel was closed.
 * 
 * @author joelauer
 */
public class SmppTimeoutException extends Exception {
    static final long serialVersionUID = 1L;
    
    public SmppTimeoutException(String msg) {
        super(msg);
    }

    public SmppTimeoutException(String msg, Throwable t) {
        super(msg, t);
    }
}
