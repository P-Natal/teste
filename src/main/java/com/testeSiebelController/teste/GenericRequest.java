package com.testeSiebelController.teste;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericRequest {
    private String param1;
    private String param2;
    private boolean param3;
    private String param4;
    private String param5;

    @Override
    public String toString() {
        return "GenericRequest{" +
                "param1='" + param1 + '\'' +
                ", param2='" + param2 + '\'' +
                ", param3=" + param3 +
                ", param4='" + param4 + '\'' +
                ", param5='" + param5 + '\'' +
                '}';
    }
}
