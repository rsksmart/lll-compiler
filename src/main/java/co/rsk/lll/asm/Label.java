package co.rsk.lll.asm;

/**
 * Created by Sergio on 25/10/2016.
 */
public class Label {
        int offset;
        String name;
        CodeBlock block;

        public Label(int v, CodeBlock ablock,String aname) {
            offset =v;
            name = aname;
            block =ablock;
        }

}
