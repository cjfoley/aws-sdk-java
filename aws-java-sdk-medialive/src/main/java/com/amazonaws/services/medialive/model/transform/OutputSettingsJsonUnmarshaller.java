/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.medialive.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.medialive.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OutputSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputSettingsJsonUnmarshaller implements Unmarshaller<OutputSettings, JsonUnmarshallerContext> {

    public OutputSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        OutputSettings outputSettings = new OutputSettings();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("archiveOutputSettings", targetDepth)) {
                    context.nextToken();
                    outputSettings.setArchiveOutputSettings(ArchiveOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("hlsOutputSettings", targetDepth)) {
                    context.nextToken();
                    outputSettings.setHlsOutputSettings(HlsOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("msSmoothOutputSettings", targetDepth)) {
                    context.nextToken();
                    outputSettings.setMsSmoothOutputSettings(MsSmoothOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("rtmpOutputSettings", targetDepth)) {
                    context.nextToken();
                    outputSettings.setRtmpOutputSettings(RtmpOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("udpOutputSettings", targetDepth)) {
                    context.nextToken();
                    outputSettings.setUdpOutputSettings(UdpOutputSettingsJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return outputSettings;
    }

    private static OutputSettingsJsonUnmarshaller instance;

    public static OutputSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OutputSettingsJsonUnmarshaller();
        return instance;
    }
}
