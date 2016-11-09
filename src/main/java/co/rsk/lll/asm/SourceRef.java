package co.rsk.lll.asm;

/**
 * Created by Sergio on 26/10/2016.
 */
public class SourceRef {
    public int position;
    public int startChar;
    public int length;
    public String source;

    public SourceRef cloneSourceRef() {
        SourceRef ret = new SourceRef(position,startChar,length,source);
        return ret;
    }

    public SourceRef(int position,int startChar,int length,String source) {
        this.position = position;
        this.startChar = startChar;
        this.length = length;
        this.source = source;
    }
}
