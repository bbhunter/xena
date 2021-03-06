/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.hssf.record.formula;

import org.apache.poi.hssf.record.RecordInputStream;

/**
 * Boolean (boolean)
 * Stores a (java) boolean value in a formula.
 * @author Paul Krause (pkrause at soundbite dot com)
 * @author Andrew C. Oliver (acoliver at apache dot org)
 * @author Jason Height (jheight at chariot dot net dot au)
 */
public final class BoolPtg extends ScalarConstantPtg {
    public final static int  SIZE = 2;
    public final static byte sid  = 0x1d;
    private final boolean _value;

    public BoolPtg(RecordInputStream in) {
        _value = (in.readByte() == 1);
    }

    public BoolPtg(String formulaToken) {
        _value = (formulaToken.equalsIgnoreCase("TRUE"));
    }

    public boolean getValue() {
        return _value;
    }

    public void writeBytes(byte [] array, int offset) {
        array[ offset + 0 ] = sid;
        array[ offset + 1 ] = (byte) (_value ? 1 : 0);
    }

    public int getSize() {
        return SIZE;
    }

    public String toFormulaString() {
        return _value ? "TRUE" : "FALSE";
    }
}
