/*
 *  Copyright 2007-2008, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.docx4j.dml.chart;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_Grouping.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_Grouping">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="percentStacked"/>
 *     &lt;enumeration value="standard"/>
 *     &lt;enumeration value="stacked"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_Grouping")
@XmlEnum
public enum STGrouping {


    /**
     *  100% Stacked
     * 
     */
    @XmlEnumValue("percentStacked")
    PERCENT_STACKED("percentStacked"),

    /**
     * Standard
     * 
     */
    @XmlEnumValue("standard")
    STANDARD("standard"),

    /**
     * Stacked
     * 
     */
    @XmlEnumValue("stacked")
    STACKED("stacked");
    private final String value;

    STGrouping(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STGrouping fromValue(String v) {
        for (STGrouping c: STGrouping.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
