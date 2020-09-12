package com.business.decision;

import com.amazonaws.services.lambda.runtime.ClientContext;
import com.amazonaws.services.lambda.runtime.CognitoIdentity;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class TestContext implements Context {

    public TestContext() {}
    public String getAwsRequestId(){
        return new String("239bb9b6-25f2-4b52-9729-e07699739986");
    }
    public String getLogGroupName(){
        return new String("/aws/lambda/java-lambda-example-function-13GAGI0F50DSI");
    }
    public String getLogStreamName(){
        return new String("2020/09/12/[$LATEST]7e8cd11535334ac5a529e58862a6e05c");
    }
    public String getFunctionName(){
        return new String("ava-lambda-example-function-13GAGI0F50DSI");
    }
    public String getFunctionVersion(){
        return new String("$LATEST");
    }
    public String getInvokedFunctionArn(){
        return new String("arn:aws:lambda:eu-central-1:780462955238:function:java-lambda-example-function-13GAGI0F50DSI");
    }
    public CognitoIdentity getIdentity(){
        return null;
    }
    public ClientContext getClientContext(){
        return null;
    }
    public int getRemainingTimeInMillis(){
        return 300000;
    }
    public int getMemoryLimitInMB(){
        return 512;
    }
    public LambdaLogger getLogger(){
        return new TestLogger();
    }
}
