
package com.mycompany.bbc_hotelresortreserv;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.UIManager;

public class UIdefaults {

    public UIdefaults() {
        
        UIManager.put("Panel.background", Color.TRANSLUCENT);
        UIManager.put("Button.background", Color.WHITE);
        UIManager.put("Button.margin", new Insets(2, 5, 2, 5));
        UIManager.put("TextField.background", Color.WHITE);
        UIManager.put("Label.background", Color.WHITE);
        UIManager.put("CheckBox.background", Color.WHITE);
        UIManager.put("RadioButton.background", Color.WHITE);
        
    }
    
    
    
}
