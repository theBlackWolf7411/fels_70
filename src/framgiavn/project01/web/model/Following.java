package framgiavn.project01.web.model;

import java.io.Serializable;

public class Following implements Serializable{
    private int followingUser;
    private int followedUser;

    public int getFollowingUser() {
        return followingUser;
    }

    public void setFollowingUser(int followingUser) {
        this.followingUser = followingUser;
    }

    public int getFollowedUser() {
        return followedUser;
    }

    public void setFollowedUser(int followedUser) {
        this.followedUser = followedUser;
    }
}
