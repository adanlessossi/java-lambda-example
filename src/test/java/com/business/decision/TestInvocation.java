package com.business.decision;

import com.amazonaws.services.lambda.runtime.Context;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestInvocation {

    private static final Logger logger = LoggerFactory.getLogger(TestInvocation.class);

    @Test
    void invokeTest() {
        logger.info("Invoke TEST");
        HashMap<String,String> event = new HashMap<>();
        Context context = new TestContext();
        Handler handler = new Handler();
        String result = handler.handleRequest(event, context);
        assertTrue(result.contains("200 OK"));
    }
}
