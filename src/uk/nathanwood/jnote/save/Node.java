package uk.nathanwood.jnote.save;

/**
 * Created by Nathan.
 */
public interface Node {

    public Connection.In[] getIn();
    public Connection.Out[] getOut();
    public String getName();



}
