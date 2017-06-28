package system.models;

/**
 * Created by Qubo on 27.05.2017.
 */
public class User {
    private String log;
    private String pwd;

    public User() {
    }

    public User(String log, String pwd) {
        this.log = log;
        this.pwd = pwd;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        String str = "User{ Log : " + log + "; Password : " + pwd + "}";
        return str;
    }
}
