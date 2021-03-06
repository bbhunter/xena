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
 *
 * @author  andy
 * @author Jason Height (jheight at chariot dot net dot au)
 */
public class UnknownPtg extends Ptg {
    private short size = 1;

    /** Creates new UnknownPtg */

    public UnknownPtg()
    {
    }

    public UnknownPtg(RecordInputStream in) {
        // doesn't need anything
    }

    public boolean isBaseToken() {
    	return true;
    }
    public void writeBytes(byte [] array, int offset)
    {
    }

    public int getSize()
    {
        return size;
    }

    public String toFormulaString()
    {
        return "UNKNOWN";
    }
    public byte getDefaultOperandClass() {return Ptg.CLASS_VALUE;}

    public Object clone() {
      return new UnknownPtg();
    }

    
}
