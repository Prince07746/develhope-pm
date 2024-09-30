package Databases;


import java.util.Objects;

public class User {
    String name;
    String lastName;
    String status;
    String connection;

    public User(String name, String lastName, String status) {
        this.name = name;
        this.lastName = lastName;
        this.status = status;
        this.connection = "CONNECTED";
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStatus() {
        return status;
    }

    public String getConnection() {
        return connection;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return
                "\n\t______________________________"+
                        "\n\t|name=>       |" + name+
                        "\n\t|lastName=>   |" + lastName+
                        "\n\t|status=>     |" + status+
                        "\n\t|connection=> |" + connection+
                        "\n\t==============================";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(lastName, user.lastName) && Objects.equals(status, user.status) && Objects.equals(connection, user.connection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, status, connection);
    }
}
