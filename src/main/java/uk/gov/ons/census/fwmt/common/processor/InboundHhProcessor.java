package uk.gov.ons.census.fwmt.common.processor;

import uk.gov.ons.census.fwmt.common.error.GatewayException;

import java.time.Instant;

public interface InboundHhProcessor<T> {
    ProcessorKeyHh getKey();

    boolean isValid(T rmRequest);

    void process(T rmRequest, Instant messageReceivedTime) throws GatewayException;

}