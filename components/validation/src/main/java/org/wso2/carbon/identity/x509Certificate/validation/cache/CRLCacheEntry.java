/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.x509Certificate.validation.cache;

import java.io.Serializable;
import java.security.cert.X509CRL;

/**
 * CRL cache entry with X509CRL.
 */
public class CRLCacheEntry implements Serializable {

    private static final long serialVersionUID = 1591693579088522864L;

    private X509CRL x509CRL;

    /**
     * Get X509 CRL.
     *
     * @return X509 CRL
     */
    public X509CRL getX509CRL() {

        return x509CRL;
    }

    /**
     * Set X509 CRL.
     *
     * @param x509CRL X509 CRL
     */
    public void setX509CRL(X509CRL x509CRL) {

        this.x509CRL = x509CRL;
    }
}
