package com.palechip.hudpixelmod.games.tnt;

import com.palechip.hudpixelmod.HudPixelConfig;
import com.palechip.hudpixelmod.components.CoinCounterComponent;
import com.palechip.hudpixelmod.components.TimerComponent;
import com.palechip.hudpixelmod.games.Game;

public class Wizards extends Game {
    public Wizards() {
        super("TNT Wizards", "", "You are on team", "You earned a total of");
        if(HudPixelConfig.tntTimeDisplay) {
            this.components.add(new TimerComponent());
        }
        if(HudPixelConfig.tntCoinDisplay) {
            this.components.add(new CoinCounterComponent());
        }
    }
}
