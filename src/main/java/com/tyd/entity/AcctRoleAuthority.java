package com.tyd.entity;

import javax.persistence.*;

/**
 * Created by ZKY on 2017-08-23 17:34.
 */
@Entity
@Table(name = "acct_role_authority", schema = "easyui", catalog = "")
public class AcctRoleAuthority
{
    private String roleId;
    private int id;
    private String authorityId;

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

    @Basic
    @Column(name = "authority_id", nullable = true, length = 36)
    public String getAuthorityId()
    {
        return authorityId;
    }

    public void setAuthorityId(String authorityId)
    {
        this.authorityId = authorityId;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        AcctRoleAuthority that = (AcctRoleAuthority) o;

        if (id != that.id)
            return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null)
            return false;
        if (authorityId != null ? !authorityId.equals(that.authorityId) : that.authorityId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + (authorityId != null ? authorityId.hashCode() : 0);
        return result;
    }
}
