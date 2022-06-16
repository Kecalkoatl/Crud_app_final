package web.model;




import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "Surname")
    private String Surname;

    @Column(name = "Departament")
    private String Departament;

    @Column(name = "Salary")
    private int Salary;

    public User(){
    }

    public User(int id, String name, String surname, String depatament, int salary) {
        this.id = id;
        Name = name;
        Surname = surname;
        Departament = depatament;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getDepartament() {
        return Departament;
    }

    public void setDepartament(String depatament) {
        Departament = depatament;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", Depatament='" + Departament + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Salary == user.Salary &&
                Objects.equals(Name, user.Name) &&
                Objects.equals(Surname, user.Surname) &&
                Objects.equals(Departament, user.Departament);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name, Surname, Departament, Salary);
    }
}
