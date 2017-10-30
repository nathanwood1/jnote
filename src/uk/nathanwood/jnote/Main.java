package uk.nathanwood.jnote;

import uk.nathanwood.jnote.window.Welcome;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by Nathan.
 */
public class Main {

    public static Font raleway;

    public static void main(String[] args) {
        File save = null;
        boolean console = false;
        for (int i = 0; i < args.length; i++) {
            if (args[i].toLowerCase().equals("-l") || args[i].toLowerCase().equals("--load")) {
                if (i + 1 == args.length) {
                    System.err.println("You need to specify a save with '" + args[i] + "'");
                    System.exit(1);
                } else {
                    save = new File(args[i + 1]);
                    if (!save.exists()) {
                        System.err.println("File specified doesn't exist (" + args[i + 1] + ")");
                    }
                    i++;
                }
            }
            if (args[i].toLowerCase().equals("-c") || args[i].toLowerCase().equals("--console")) {
                console = true;
            }
        }
        if (console) {
            System.err.println("Console mode not yet supported.");
        } else {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                raleway = Font.createFont(Font.TRUETYPE_FONT, new File(Main.class.getResource("Raleway.ttf").toURI()));
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException | IOException | FontFormatException | URISyntaxException e) {
                e.printStackTrace();
            }
            if (save != null) {
                System.err.println("File loading from console not supported yet.");
            }
            Welcome welcome = new Welcome();
        }
    }

}
