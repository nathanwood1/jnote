package uk.nathanwood.jnote.save;

import java.io.Serializable;

/**
 * Created by Nathan.
 */
public class Connection {

    public enum Type {
        NODE,
        VALUE;
    }

    public static class In implements Serializable {
        public Out pair;
        public Type type;

        public void pair(Out out) {
            this.pair = out;
            this.pair.pair = this;
        }
    }

    public static class Out implements Serializable {
        public In pair;
        public Type type;

        public void pair(In in) {
            this.pair = in;
            this.pair.pair = this;
        }
    }

}
