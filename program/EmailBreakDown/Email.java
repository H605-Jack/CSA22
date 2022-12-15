package EmailBreakDown;

public class Email {
    private String username;
    private String server;
    private String domain;
    private String fullEmail;

    public Email() {
        this.username = "unknown";
        this.server = "example";
        this.domain = "com";  
        this.fullEmail = "unknown@example.com";  
    }

    public Email(String getEmail) {
        this.fullEmail = getEmail;
    }

    public String getUsername() {
        return this.username = this.fullEmail.substring(0, this.fullEmail.indexOf("@"));
    }

    public String getServer() {
        String temp = this.fullEmail.substring(this.fullEmail.indexOf("@") + 1);
        return this.server = temp.substring(0, temp.indexOf("."));
    }

    public String getDomain() {
        String temp = this.fullEmail.substring(this.fullEmail.indexOf("@") + 1);
        return this.domain = temp.substring(temp.indexOf(".") + 1);
    }

    // breakdown methods
    public void getEmailBreakdown() {
        // breaking down username, server, domain code starts here
        System.out.println("Username: " + this.getUsername());
        System.out.println("Server: " + this.getServer());
        System.out.println("Domain: " + this.getDomain());
    }

}
