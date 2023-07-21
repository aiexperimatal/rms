package com.krazykritterranch.apps.model.user;

import com.krazykritterranch.apps.model.BaseVO;
import com.krazykritterranch.apps.model.common.Address;
import com.krazykritterranch.apps.model.common.Email;
import com.krazykritterranch.apps.model.common.Phone;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Customer extends BaseVO {
    private String userName;
    private String firstName;
    private String lastName;
    private List<Email> emails = new ArrayList<>();
    private List<Phone> phones = new ArrayList<>();
    private List<Address> addresses = new ArrayList<>();
    private Date dateOfBirth;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Customer.class.getSimpleName() + "[", "]")
                .add("userName='" + userName + "'")
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("emails=" + emails)
                .add("phones=" + phones)
                .add("addresses=" + addresses)
                .add("dateOfBirth=" + dateOfBirth)
                .toString();
    }
}
