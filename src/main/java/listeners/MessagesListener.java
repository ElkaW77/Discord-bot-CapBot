package listeners;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class MessagesListener implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if(event.getMessageAuthor().isBotUser()) return;

        if(event.getMessageContent().contains("cap")) event.getChannel().sendMessage(":billed_cap:");

        //Erics ID: 188287832715034625
        //Auf Erics Nachrichten wird mit Cap reagiert
        if(Long.toString(event.getMessageAuthor().getId()).equals("188287832715034625")) event.getMessage().addReaction("\uD83E\uDDE2");

    }
}
