import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> buddyInfos;

    public AddressBook(){
        buddyInfos = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo b){
        buddyInfos.add(b);
    }

    public void removeBuddy(BuddyInfo b){
        buddyInfos.remove(b);
    }

    public static void main(String[] args) {
        BuddyInfo b = new BuddyInfo("Tom","Carleton","613");
        AddressBook buddies = new AddressBook();
        buddies.addBuddy(b);
        buddies.removeBuddy(b);
        System.out.println("Address Book");
        System.out.println("temp");
        System.out.println("test added");_
    }
}
