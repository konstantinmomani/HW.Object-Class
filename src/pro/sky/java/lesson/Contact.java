package pro.sky.java.lesson;

import java.util.Objects;

public class Contact {
    private final String nick;
    private String phone;
    public Contact(String id, String phone) {
        this.nick = id;
        this.phone = phone;
    }
    public String getNick() {
        return nick;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(nick, contact.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nick='" + nick + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
    //    @Override
//    public boolean equals(Object other) {
//        if(this.getClass() != other.getClass()) {
//            return false;
//        }
//        Contact c2 = (Contact) other;
//        return nick.equals(c2.nick);
//    }
//    @Override
//    public int hashCode() {
//        return java.util.Objects.hash(nick);
//    }
//    @Override
//    public String toString() {
//        return nick + ": " + phone;
//    }
}
