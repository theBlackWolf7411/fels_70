package framgiavn.project01.web.model;

import java.io.Serializable;

public class Activity implements Serializable {
    private static final long serialVersionUID = 1L;
    private int activityId;
    private int userId;
    private int targetId;
    private int type;

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getTargetId() {
        return targetId;
    }

    public void setTargetId(int targetId) {
        this.targetId = targetId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
