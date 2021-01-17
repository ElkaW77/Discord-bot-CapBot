package listeners;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

public class MessagesListener implements MessageCreateListener {

    @Override
    public void onMessageCreate(MessageCreateEvent event) {
        if(event.getMessageAuthor().isBotUser()) return;

        if(event.getMessageContent().contains("no cap")) {
            event.getChannel().sendMessage(":no_entry_sign: :billed_cap:");
            event.getMessage().delete();
        } else if(event.getMessageContent().contains("cap")) {
            event.getChannel().sendMessage(":billed_cap:");
        }



        //Exchange the ID with Id of your choice
        //react to message with Cap Emoji
        if(Long.toString(event.getMessageAuthor().getId()).equals("188287832715034625")) event.getMessage().addReaction("\uD83E\uDDE2");

    }
}
