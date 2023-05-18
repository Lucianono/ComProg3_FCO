
package com.mycompany.bbc_hotelresortreserv;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.UIManager;

public class BbcUI {

    public static Color lightbrown = new Color (255, 250, 242);
    public static Color brown = new Color (102,51,0);
    public static Color gray = new Color (105, 104, 104);
    public static Color naturalbrown = new Color (105, 71, 37);
    public static Color red = new Color (255, 84, 84);
    
    public BbcUI() {
        
        UIManager.put("Panel.background", Color.TRANSLUCENT);
        
        UIManager.put("Button.background", Color.gray);
        UIManager.put("Button.foreground", Color.WHITE);
        UIManager.put("Button.margin", new Insets(2, 5, 2, 5));
        UIManager.put("Button.font", new Font("Verdana", Font.BOLD, 12));
        
        
        UIManager.put("TextField.background", Color.WHITE);

        
        UIManager.put("CheckBox.background", Color.WHITE);
        UIManager.put("RadioButton.background", Color.WHITE);
        UIManager.put("ComboBox.background", Color.WHITE);
        UIManager.put("Viewport.background", Color.WHITE);
        
    }
    
    
    
}
