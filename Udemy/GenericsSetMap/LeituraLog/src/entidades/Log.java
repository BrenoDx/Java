package entidades;

import java.util.Date;
import java.util.Objects;

public class Log {
    private String user;
    private Date data;

    public Log(String user, Date data) {
        this.user = user;
        this.data = data;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return Objects.equals(user, log.user);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(user);
    }
}
