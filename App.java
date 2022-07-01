package ceng.anadolu.bim492;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        System.out.println("\n******** ITERATOR AND TEMPLATE DESIGN PATTERNS ********\n\n");

        Network network = null;

        String userName = "aliyurekli";
        System.out.println("The value of user name: " + userName);


        String password = "123456789";
        System.out.println("The value of user's password: " + password);

        String message = "I'm sharing a post on Social Media!";

        System.out.println("\nChoose social network for posting a message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = 2;

        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        System.out.println("\nYou have select 'Twitter' between the choices.");

        System.out.println("\n\nThe message user wants to share is: " + "'" + message + "'");

        network.post(message);


        System.out.println("\n*****************************************************************************\n");

        System.out.println("Please specify social network to send invitations. (default: is 'Facebook'):");
        System.out.println("1. Facebook");
        System.out.println("2. Twitter");

        String invitationChoice = "2";
        System.out.println("\nYou have select 'Twitter' between the choices.");

        SocialNetwork networkInvitation;
        if (invitationChoice.equals("2")) {
            networkInvitation = new Twitter(createTestProfiles());
        } else {
            networkInvitation = new Facebook(createTestProfiles());
        }

        SocialInvitation invitation = new SocialInvitation(networkInvitation);
        invitation.sendInvitationToFriends("aliyürekli@eskisehir.edu.tr",
                "Hey! This is Ali Yürekli.\nI found a very useful activity for our department.\nDo you " +
                        "want to take a look? Here is the link if you're interested ->  [link]");
        invitation.sendInvitationToCloseFriends("aliyürekli@eskisehir.edu.tr",
                "Hey! This is Ali Yürekli.\nI believe it will be very beneficial for you to participate" +
                        " this event.\nHere is the link -> [link]. Let me know if you are attending!\nHave a nice day. :)");

    }


    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<Profile>();
        data.add(new Profile("ozgurozsen@eskisehir.edu.tr", "Özgür Özşen", "Friends:burcuyilmazel@eskisehir.edu.tr", "Friends:yasarhoscan@eskisehir.edu.tr", "Close Friends:cahitperkgöz@eskisehir.edu.tr"));
        data.add(new Profile("burcuyilmazel@eskisehir.edu.tr", "Burcu Yürekli Yılmazel", "Friends:aliyürekli@eskisehir.edu.tr", "Close Friends:ozgurozsen@eskisehir.edu.tr"));
        data.add(new Profile("aliyürekli@eskisehir.edu.tr", "Ali Yürekli", "Friends:burcuyilmazel@eskisehir.edu.tr", "Close Friends:yasarhoscan@eskisehir.edu.tr", "Close Friends:ozgurozsen@eskisehir.edu.tr"));
        data.add(new Profile("cahitperkgöz@eskisehir.edu.tr", "Cahit Perkgöz", "Close Friends:ozgurozsen@eskisehir.edu.tr"));
        data.add(new Profile("yasarhoscan@eskisehir.edu.tr", "Yaşar Hoşcan", "Close Friends:sevcanyilmazgunduz@eskisehir.edu.tr", "Close Friends:aliyürekli@eskisehir.edu.tr", "Friends: ozgurozsen@eskisehir.edu.tr"));
        data.add(new Profile("sevcanyilmazgunduz@eskisehir.edu.tr", "Sevcan Yılmaz Gündüz", "Friends:yasarhoscan@eskisehir.edu.tr", "Friends:burcuyilmazel@eskisehir.edu.tr"));
        return data;

    }
}


