package com.ben.dto;

import lombok.Data;

@Data
public class GenericDto<T> {

    private T payload;

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }
}
