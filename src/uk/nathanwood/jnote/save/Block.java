package uk.nathanwood.jnote.save;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Nathan.
 */
public class Block implements Serializable {

    public String label;
    public ArrayList<Node> nodes;

}
