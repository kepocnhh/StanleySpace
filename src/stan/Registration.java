package stan;

public class Registration
        extends Space
{
    Login login;
    UserMoreInfo umi;
    public Registration(Login l, UserMoreInfo u)
    {
            this.login = l;
            this.umi = u;
    }
    //
    public Login GetNewLogin()
    {
        return this.login;
    }
    public UserMoreInfo GetNewUMI()
    {
        return this.umi;
    }
}