package stan;

public class Login
        extends Space
{
    String mail;
    String pass;
    public Login(String m, String p)
    {
            this.mail = m;
            this.pass = p;
    }
    public Login(String line)
    {
        String[] insplits = line.split("\t");
            this.mail = insplits[0];
            this.pass = insplits[1];
    }
    public String GetMail()
    {
        return this.mail;
    }
    //
    @Override
    public String toString()
    {
        return this.mail + "\t" +
                this.pass;
    }
}