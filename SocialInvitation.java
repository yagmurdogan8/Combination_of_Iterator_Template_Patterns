package ceng.anadolu.bim492;

public class SocialInvitation {
    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialInvitation(SocialNetwork network) {
        this.network = network;
    }

    public void sendInvitationToFriends(String profileEmail, String message) {
        System.out.println("\nIterating over your friends...\n");
        iterator = network.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendInvitationToCloseFriends(String profileEmail, String message) {
        System.out.println("\nIterating over your close friends...\n");
        iterator = network.createCloseFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(String email, String message) {
        System.out.println("\nSent message to: '" + email + "'. \nMessage body: '" + message + "'");
    }
}
