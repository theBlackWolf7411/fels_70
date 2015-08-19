package framgiavn.project01.web.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private int userId;
    private String username;
    private String password;
    private String email;
    private String avatar;
    private boolean isAdmin;
    private List<Activity> activities;
    private List<Following> followingUsers;
    private List<Following> followedUsers;

    public List<Following> getFollowingUsers() {
        return followingUsers;
    }

    public void setFollowingUsers(List<Following> followingUsers) {
        this.followingUsers = followingUsers;
    }

    public List<Following> getFollowedUsers() {
        return followedUsers;
    }

    public void setFollowedUsers(List<Following> followedUsers) {
        this.followedUsers = followedUsers;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}