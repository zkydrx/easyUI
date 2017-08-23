package com.tyd.entity;

import javax.persistence.*;

/**
 * Created by ZKY on 2017-08-23 17:34.
 */
@Entity
@Table(name = "acct_user_role", schema = "easyui", catalog = "")
public class AcctUserRole
{
    private String userId;
    private String roleId;
    private int id;

    @Basic
    @Column(name = "user_id", nullable = true, length = 36)
    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    @Basic
    @Column(name = "role_id", nullable = true, length = 36)
    public String getRoleId()
    {
        return roleId;
    }

    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        AcctUserRole that = (AcctUserRole) o;

        if (id != that.id)
            return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null)
            return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
