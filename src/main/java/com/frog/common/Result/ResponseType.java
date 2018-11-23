package com.frog.common.Result;

public enum ResponseType {
    HAVE_ORDERNO(211),NO_ORDERNO(212),NOT_MATCH_ORDERNO(213),HAS_EXIST(214),HAS_NO_EXIST(215),LARGE_MONEY_RANG(216),EMPTY_CODE(201);

    private Integer key;

    private ResponseType(Integer key) {
        this.key = key;
    }

    public Integer getCode() {
        return this.key;
    }
}
