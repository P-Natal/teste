package com.testeSiebelController.teste;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FinishedMigrationRequest {
    private String msisdn;
    private String planName;
    private boolean success;
    private String executionDate;
    private String errorDetail;

    @Override
    public String toString() {
        return "FinishedMigrationRequest{" +
                "msisdn='" + msisdn + '\'' +
                ", planName='" + planName + '\'' +
                ", success=" + success +
                ", executionDate='" + executionDate + '\'' +
                ", errorDetail='" + errorDetail + '\'' +
                '}';
    }
}
