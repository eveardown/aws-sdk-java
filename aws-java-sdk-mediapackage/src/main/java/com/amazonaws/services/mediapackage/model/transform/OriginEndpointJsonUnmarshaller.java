/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediapackage.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.mediapackage.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * OriginEndpoint JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OriginEndpointJsonUnmarshaller implements Unmarshaller<OriginEndpoint, JsonUnmarshallerContext> {

    public OriginEndpoint unmarshall(JsonUnmarshallerContext context) throws Exception {
        OriginEndpoint originEndpoint = new OriginEndpoint();

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
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("channelId", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setChannelId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cmafPackage", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setCmafPackage(CmafPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("dashPackage", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setDashPackage(DashPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("description", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("hlsPackage", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setHlsPackage(HlsPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("id", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("manifestName", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setManifestName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("mssPackage", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setMssPackage(MssPackageJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("origination", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setOrigination(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("startoverWindowSeconds", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setStartoverWindowSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("tags", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setTags(new MapUnmarshaller<String, String>(context.getUnmarshaller(String.class), context.getUnmarshaller(String.class))
                            .unmarshall(context));
                }
                if (context.testExpression("timeDelaySeconds", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setTimeDelaySeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("url", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setUrl(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("whitelist", targetDepth)) {
                    context.nextToken();
                    originEndpoint.setWhitelist(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return originEndpoint;
    }

    private static OriginEndpointJsonUnmarshaller instance;

    public static OriginEndpointJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OriginEndpointJsonUnmarshaller();
        return instance;
    }
}
