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
//        BuddyInfo b = new BuddyInfo("","","");
//        ArrayList<BuddyInfo> buddies = new ArrayList();
//        buddies.addBuddy(b);
        System.out.println("Address Book");
    }
}
