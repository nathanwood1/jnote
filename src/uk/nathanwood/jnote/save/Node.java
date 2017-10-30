package uk.nathanwood.jnote.save;

import java.io.Serializable;

/**
 * Created by Nathan.
 */
public class Node implements Serializable {

    public enum Type {
        NOTE_PLAYER(new Connection.Type[]{},
                new Connection.Type[]{Connection.Type.NODE}, "Note Player"),
        SYNTH_SIN(new Connection.Type[]{Connection.Type.NODE},
                new Connection.Type[]{Connection.Type.VALUE}, "Sine Wave"),
        ADD(new Connection.Type[]{Connection.Type.VALUE, Connection.Type.VALUE},
                new Connection.Type[]{Connection.Type.VALUE}, "Add Operation"),
        SUBTRACT(new Connection.Type[]{Connection.Type.VALUE, Connection.Type.VALUE},
                new Connection.Type[]{Connection.Type.VALUE}, "Subtract Operation"),
        MULTIPLY(new Connection.Type[]{Connection.Type.VALUE, Connection.Type.VALUE},
                new Connection.Type[]{Connection.Type.VALUE}, "Multiply Operation"),
        DIVIDE(new Connection.Type[]{Connection.Type.VALUE, Connection.Type.VALUE},
                new Connection.Type[]{Connection.Type.VALUE}, "Divide Operation"),
        OUTPUT(new Connection.Type[]{Connection.Type.VALUE},
                new Connection.Type[]{}, "Output Node");

        public Connection.Type[] in;
        public Connection.Type[] out;
        public String name;

        Type(Connection.Type[] in, Connection.Type[] out, String name) {
            this.in = in;
            this.out = out;
            this.name = name;
        }
    }

    public String name;
    public Object[] data;
    public Type blockType;
    public Connection.In[] inputConnections;
    public Connection.Out[] outputConnections;

}
