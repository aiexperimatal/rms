package com.krazykritterranch.apps.model.common;

import com.krazykritterranch.apps.model.BaseVO;

import java.util.StringJoiner;

public class Phone extends BaseVO {
    private String areaCode;
    private String exchange;
    private String phoneNumber;

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Phone.class.getSimpleName() + "[", "]")
                .add("areaCode='" + areaCode + "'")
                .add("exchange='" + exchange + "'")
                .add("phoneNumber='" + phoneNumber + "'")
                .toString();
    }
}
