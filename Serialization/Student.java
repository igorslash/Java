package Serialization;


import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private int id;
    private String name;
    private Teacher learn;//transient если не нужно сереализовывать

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int i, String igor, Teacher programmer) {
    }

    public Student(String name) {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    //То что нормально записать не можем записываем напрямую через метод

    //    private void writeObject(ObjectOutputStream oos) throws IOException {
//        oos.defaultWriteObject();
//        oos.writeInt();
//    }
//}
    //    private void readObject(ObjectInputStream ois)  throws IOException {
//        ois.defaultReadObject();
 //       this.student = new User(ois.readInt(), (String) ois.readObject);
//    }
//}
    static class Teacher extends Student implements Serializable {
        private String learn;

        public Teacher(String learn, String name) {
            super(name);
            this.learn = learn;
        }

        @Override
        public String toString() {
            return "Teacher{" +
                    "learn='" + learn + '\'' +
                    '}';
        }

        public String getLearn() {
            return learn;
        }

        public void setLearn(String learn) {
            this.learn = learn;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Teacher teacher = (Teacher) o;
            return Objects.equals(learn, teacher.learn);
        }

        @Override
        public int hashCode() {
            return Objects.hash(learn);
        }
    }
}