package com.krazykritterranch.apps.model.common;

import com.krazykritterranch.apps.model.BaseVO;

import java.util.StringJoiner;

public class StateOrProvince  extends BaseVO {
    private String name;
    private String abbr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StateOrProvince.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("abbr='" + abbr + "'")
                .toString();
    }
}
