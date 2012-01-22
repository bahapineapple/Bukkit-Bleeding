package org.bukkit.conversations;

/**
 * A ConversationCanceller is a class that cancels an active {@link Conversation}. A Conversation can have more
 * than one ConversationCanceller.
 */
public interface ConversationCanceller {

    /**
     * Sets the conversation this ConversationCanceller can optionally cancel.
     * @param conversation A conversation.
     */
    public void setConversation(Conversation conversation);

    /**
     * Cancels a conversation based on user input/
     * @param context Context information about the conversation.
     * @param input The input text from the user.
     * @return True to cancel the conversation, False otherwise.
     */
    public boolean cancelBasedOnInput(ConversationContext context, String input);
}