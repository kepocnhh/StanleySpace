package stan;

public class UserInfo
        extends Space
{
    String fam;
    String name;
    String patronymic;
    String mail;
    public UserInfo(String line)
    {
        String[] insplits = line.split("\t");
            this.fam = insplits[0];
            this.name = insplits[1];
            this.patronymic = insplits[2];
            this.mail = insplits[3];
    }
    public UserInfo(String f, String n, String p, String m)
    {
            this.fam = f;
            this.name = n;
            this.patronymic = p;
            this.mail = m;
    }
}