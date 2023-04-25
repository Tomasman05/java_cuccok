package ceasarcoding;

public class CeasarCoding {

    public static String code(String text, int offset)
{
    char[] out = text.toCharArray();
    
    for (int i = 0; i < out.length; i++) {
        if (out[i]>=65 && out[i]<=90)
        {
            out[i]+=offset;
            if (out[i]>90)
            {
                out[i]-=26;
            }
            if (out[i]<65)
            {
                out[i]+=26;
            }
        }
        
        if (out[i]>=97 && out[i]<=122)
        {
            out[i]+=offset;
              if (out[i]>122)
            {
                out[i]-=26;
            }
                if (out[i]<97)
            {
                out[i]+=26;
            }

        }
        
        
    }
    
    return new String(out);    
}
public static String deCode(String text, int offset)
{
    return code(text, -offset);
}
}
