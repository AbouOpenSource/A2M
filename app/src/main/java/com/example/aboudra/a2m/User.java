package com.example.aboudra.a2m;

public class User
{
    private String Uid;


    private String firstName;
    private String lastName;
    private String password;
    private String cellPhone;

    public void setUid(String uid) {
        Uid = uid;
    }

    public String getUid() {

        return Uid;
    }

    public User(String uid, String firstName, String lastName, String password, String cellPhone) {
        Uid = uid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.cellPhone = cellPhone;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }


    public User(String firstName, String lastName, String password, String cellPhone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.cellPhone = cellPhone;
    }










    private boolean validator(String firstName, String lastName, String password,String cellphone)
    {

        if(!firstName.isEmpty())
        {
            if(!lastName.isEmpty())
            {
                if(!password.isEmpty())
                {
                    if(!cellphone.isEmpty())
                    {
                        return true;
                    }

                }
            }
        }



        return false;
    }







}
