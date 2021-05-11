package events;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.response.FormResponseSimple;
import cn.nukkit.form.window.FormWindowSimple;

public class PlayerFormRespondedEventEvent implements Listener {
	
	@EventHandler
	public void on(PlayerFormRespondedEvent event)
	{
		Player player = event.getPlayer();
		if(event.getWindow() instanceof FormWindowSimple) {
            FormWindowSimple form = (FormWindowSimple) event.getWindow();
            FormResponseSimple response = form.getResponse();
            if(response == null)
                        return;
            else if(response.getClickedButton().getText().equals("Bauer")) {
            	player.sendMessage("");
  	  }     
	}	
  }
}