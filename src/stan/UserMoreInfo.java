package stan;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMoreInfo
        extends UserInfo
{
    String phone;
    short sex;// 0 - не указано // 1 - мужской // 2 - женский //
    Date birth;
    
    public UserMoreInfo(String line, String line2) 
    {
        super(line);
        String[] insplits = line2.split("\t");
            this.phone = insplits[0];
            this.sex = Short.parseShort(insplits[1]);
            this.birth = new Date();
    }
    public UserMoreInfo(String f, String n, String p, String m,
                                                String ph,short s,Date d) 
    {
        super(f,n,p,m);
            this.phone = ph;
            this.sex = s;
            this.birth = d;
    }
    public String GetMail()
    {
        return this.mail;
    }
    //
    @Override
    public String toString()
    {
        SimpleDateFormat dateformatyyyyMMdd = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String date_to_string = dateformatyyyyMMdd.format(this.birth);
        return this.fam + "\t" +
                this.name + "\t" +
                this.patronymic + "\t" +
                this.mail + "\n" +
                this.phone + "\t" +
                this.sex + "\t" +
                date_to_string
                ;
    }
}