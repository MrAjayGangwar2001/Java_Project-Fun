public class User {

    private String UserName;
    private int UserId;

    public User(String userName, int userId) {
        this.UserName = userName;
        this.UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        this.UserName = userName;
    }
    public int getUserId() {
        return UserId;
    }
    public void setUserId(int userId) {
        this.UserId = userId;
    }

    public void displayUserInfo() {
        System.out.println("User Name: " + UserName);
        System.out.println("User ID: " + UserId);
    }
}



