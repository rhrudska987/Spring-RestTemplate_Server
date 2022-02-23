package com.example.server.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Req<T> {

    private Header header;
    private T resBody;

    @AllArgsConstructor
    @Data
    @NoArgsConstructor
    public static class Header{
        private String responseCode;

    }
}
