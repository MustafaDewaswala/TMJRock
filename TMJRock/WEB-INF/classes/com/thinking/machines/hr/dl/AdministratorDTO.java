package com.thinking.machines.hr.dl;
public class AdministratorDTO implements java.io.Serializable,Comparable<AdministratorDTO>
{
private String username;
private String password;
public AdministratorDTO()
{
this.username="";
this.password="";
}
public void setUsername(java.lang.String username)
{
this.username=username;
}
public java.lang.String getUsername()
{
return this.username;
}
public void setPassword(java.lang.String password)
{
this.password=password;
}
public java.lang.String getPassword()
{
return this.password;
}

public boolean equals(Object other)
{
if(!(other instanceof AdministratorDTO)) return false;
AdministratorDTO administratorDTO=(AdministratorDTO)other;
return this.username.equals(administratorDTO.getUsername());
}
public int compareTo(AdministratorDTO administratorDTO)
{
return this.username.compareTo(administratorDTO.username);
}
public int hashCode()
{
return this.username.hashCode();
}

}