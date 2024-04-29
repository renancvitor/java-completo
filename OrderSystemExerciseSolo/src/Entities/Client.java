package Entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Client {

    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String name;
    private String email;
    private LocalDate birthDate;

    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    //private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString() {
        return "Cliente:  " + name + " (" + dateTimeFormatter.format(birthDate) + ") - " + email;
    }
}
