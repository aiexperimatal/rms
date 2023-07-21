package com.krazykritterranch.apps.model;

import java.util.StringJoiner;

public class BaseVO {
    private Integer voId;

    public Integer getVoId() {
        return voId;
    }

    public void setVoId(Integer voId) {
        this.voId = voId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", BaseVO.class.getSimpleName() + "[", "]")
                .add("voId=" + voId)
                .toString();
    }
}
