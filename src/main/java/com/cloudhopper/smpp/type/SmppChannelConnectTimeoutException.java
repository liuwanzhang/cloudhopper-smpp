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
 * Thrown for exceptions occuring while attempting to connect to a remote
 * system and cannot complete within a period of time.
 * 
 * @author joelauer
 */
public class SmppChannelConnectTimeoutException extends SmppChannelConnectException {
    static final long serialVersionUID = 1L;
    
    public SmppChannelConnectTimeoutException(String msg) {
        super(msg);
    }

    public SmppChannelConnectTimeoutException(String msg, Throwable t) {
        super(msg, t);
    }
}
