package password;

public class PasswordManager {
    private String username;
    private String password;

    public PasswordManager() {
        username = "null";
        password = "null";
    }

    public PasswordManager(String u, String p) {
        username = u;
        password = p;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String u) {
        username = u;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String p) {
        password = p;
    }
}
