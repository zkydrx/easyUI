package com.tyd.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ZKY on 2017-08-23 17:34.
 */
@Entity
@Table(name = "acct_user", schema = "easyui", catalog = "")
public class AcctUser
{
    private String id;
    private String telephone;
    private Date registerDate;
    private String nickName;

    @Id
    @Column(name = "id", nullable = false, length = 50)
    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    @Basic
    @Column(name = "telephone", nullable = true, length = 50)
    public String getTelephone()
    {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "register_date", nullable = true)
    public Date getRegisterDate()
    {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate)
    {
        this.registerDate = registerDate;
    }

    @Basic
    @Column(name = "nick_name", nullable = true, length = 50)
    public String getNickName()
    {
        return nickName;
    }

    public void setNickName(String nickName)
    {
        this.nickName = nickName;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        AcctUser acctUser = (AcctUser) o;

        if (id != null ? !id.equals(acctUser.id) : acctUser.id != null)
            return false;
        if (telephone != null ? !telephone.equals(acctUser.telephone) : acctUser.telephone != null)
            return false;
        if (registerDate != null ? !registerDate.equals(acctUser.registerDate) : acctUser.registerDate != null)
            return false;
        if (nickName != null ? !nickName.equals(acctUser.nickName) : acctUser.nickName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (nickName != null ? nickName.hashCode() : 0);
        return result;
    }
}
