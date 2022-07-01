package ceng.anadolu.bim492;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCloseFriendsIterator(String profileEmail);
}
