package com.tyd.pojo;

/**
 * Created by ZKY on 2017-08-24 14:15.
 */
public class AcctUserDto
{
    private String id;
    private String telephone;
    private String registerDate;
    private String nickName;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    public String getRegisterDate()
    {
        return registerDate;
    }

    public void setRegisterDate(String registerDate)
    {
        this.registerDate = registerDate;
    }

    public String getNickName()
    {
        return nickName;
    }

    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }
}
