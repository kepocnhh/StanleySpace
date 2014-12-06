package stan;

public class Message
	extends Space
{
    private String message;
    
    public String GetMessage()
    {
        return this.message;
    }
    
    public Message(String m)
    {
        this.message = m;
    }
}