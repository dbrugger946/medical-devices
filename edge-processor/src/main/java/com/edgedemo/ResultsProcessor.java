package com.edgedemo;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

@RegisterForReflection
public class ResultsProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String custom = exchange.getIn()
            .getBody(String.class); 
        int pos = custom.indexOf("");
        String detections = custom.substring(pos, custom.length());
        exchange.getIn().setHeader("data-payload", detections); 
    }
}

