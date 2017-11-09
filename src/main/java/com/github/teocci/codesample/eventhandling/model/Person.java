package com.github.teocci.codesample.eventhandling.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by teocci.
 *
 * @author teocci@yandex.com on 2017-Nov-09
 */
public class Person
{
    private final StringProperty firstName;
    private final StringProperty lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
    }

    public String getFirstName()
    {
        return firstName.get();
    }

    public void setFirstName(String firstName)
    {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName.get();
    }

    public void setLastName(String lastName)
    {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty()
    {
        return lastName;
    }

    @Override
    public String toString()
    {
        return getFirstName() + " " + getLastName();
    }
}
