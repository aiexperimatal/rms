package com.krazykritterranch.apps.model.common;

import com.krazykritterranch.apps.model.BaseVO;

import java.util.StringJoiner;

public class Email extends BaseVO {
    private String emailAccount;
    private String domain;
    private String tld;

    public String getEmailAccount() {
        return emailAccount;
    }

    public void setEmailAccount(String emailAccount) {
        this.emailAccount = emailAccount;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getTld() {
        return tld;
    }

    public void setTld(String tld) {
        this.tld = tld;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Email.class.getSimpleName() + "[", "]")
                .add("emailAccount='" + emailAccount + "'")
                .add("domain='" + domain + "'")
                .add("tld='" + tld + "'")
                .toString();
    }
}
