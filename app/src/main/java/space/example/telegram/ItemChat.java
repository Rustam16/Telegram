package space.example.telegram;


public class ItemChat {
    String chatName, lastMassage, userTime;


    public ItemChat(String chatName, String lastMassage, String userTime) {
        this.chatName = chatName;
        this.lastMassage = lastMassage;
        this.userTime = userTime;
    }


    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public String getLastMassage() {
        return lastMassage;
    }

    public void setLastMassage(String lastMassage) {
        this.lastMassage = lastMassage;
    }


    public String getUserTime() {
        return userTime;
    }

    public void setUserTime(String userTime) {
        this.userTime = userTime;
    }


}
