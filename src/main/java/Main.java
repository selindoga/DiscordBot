import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;
import static net.dv8tion.jda.api.AccountType.*;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault("ODg0MDQxMDU4MjkwMzk3MTk0.YTStZA.aaRvWOZCGGnTEP3Ay_gXX1Lmzg0");
        builder.addEventListeners(new Main());
        builder.build();
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        System.out.println("We received a new message from "
                + event.getAuthor().getName() + ": "
                + event.getMessage().getContentDisplay());

        if(event.getMessage().getContentRaw().contains("naber"))
        {
            event.getChannel().sendMessage("merabalar, bende bot (ayakkabi degilim) :D").queue();
        }
        if(event.getMessage().getContentRaw().equals("aferim bana"))
        {
            event.getChannel().sendMessage("yess aferim lan bana hehe").queue();
        }
        if(event.getMessage().getContentRaw().equals("harikayim lan ben"))
        {
            event.getChannel().sendMessage("BEN MUHTESEMIMM !! ").queue();
        }
        if(event.getMessage().getContentRaw().equals("hehehe"))
        {
            event.getChannel().sendMessage("NIHUHAHAHAAHAAAAA!!!! :D :D").queue();
        }
        if(event.getMessage().getContentRaw().equals("BOT BANA CEVAP VERR"))
        {
            event.getChannel().sendMessage("tamam abi hemen abi").queue();
        }
    }
}
