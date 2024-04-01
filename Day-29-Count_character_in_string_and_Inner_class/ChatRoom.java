// application of inner class in java

// this is application of inner clsas concept that using we crated chatroom 

// main class representing room of the chat
public class ChatRoom 
{
    private String roomName;

    // Constructor of main class
    public ChatRoom(String roomName) 
    {
        this.roomName = roomName;
    }


    // Inner class representing a message
    public class Message 
    {
        private String sender;
        private String content;

        // Constructor of inner class
        public Message(String sender, String content) 
        {
            this.sender = sender;
            this.content = content;
        }

        // Getters of inner class
        public String getSender() 
        {
            return sender;

        }

        public String getContent() 
        {
            return content;
        }
    }

    // Method to send a message
    public void sendMessage(String sender, String content) 
    {
        // Create a new Message object
        Message message = new Message(sender, content);



        // Print the message details form the given input
        System.out.println("[" + roomName + "] " + message.getSender() + ": " + message.getContent());
    }

    public static void main(String[] args) 
    {
        System.out.println();


        // Create a ChatRoom object for new chatroom Gereral
        ChatRoom chatRoom1 = new ChatRoom("General");

        // Send some messages to this chat room we calling the methods
        chatRoom1.sendMessage("Ravi", "Hello, everyone!");
        chatRoom1.sendMessage("Harsh", "Hi, Ravi!");


        System.out.println();


        // Create a ChatRoom object for new chatroom is Admin 
        ChatRoom chatRoom2 = new ChatRoom("Admin");

        // Send some messages to this chat room we calling the methods
        chatRoom2.sendMessage("Ajay", "Welcome the Admin");
        chatRoom2.sendMessage("Shrikant", "Hi, Ajay!");
    }
}
