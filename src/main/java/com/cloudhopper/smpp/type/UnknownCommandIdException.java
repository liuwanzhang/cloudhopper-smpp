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

import com.cloudhopper.smpp.pdu.Pdu;

/**
 * Thrown when an unsupported or invalid Command ID was decoded.  This is likely
 * a recoverable error.  The recommended action is to either return a NAK or
 * a specific SMPP error code.
 * 
 * @author joelauer
 */
public class UnknownCommandIdException extends RecoverablePduException {
    static final long serialVersionUID = 1L;

    public UnknownCommandIdException(Pdu partialPdu, String msg) {
        super(partialPdu, msg);
    }

    public UnknownCommandIdException(Pdu partialPdu, String msg, Throwable t) {
        super(partialPdu, msg, t);
    }
}