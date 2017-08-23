package com.tyd.entity;

import javax.persistence.*;

/**
 * Created by ZKY on 2017-08-23 17:34.
 */
@Entity
@Table(name = "acct_role", schema = "easyui", catalog = "")
public class AcctRole
{
    private String id;
    private String name;

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
    @Column(name = "name", nullable = true, length = 255)
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        AcctRole acctRole = (AcctRole) o;

        if (id != null ? !id.equals(acctRole.id) : acctRole.id != null)
            return false;
        if (name != null ? !name.equals(acctRole.name) : acctRole.name != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
