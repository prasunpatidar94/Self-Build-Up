package design.test;

import java.io.*;

public class SerialLizationAndDeserialization {

    public static void main(String[] args) {

        Student student = new Student(101, "Prasun", "Kasrawad");
        String path = "C:\\WorkSpace\\JAVA-POC\\Java8NewFeatures\\serializationTest.ser";
        serialization(path, student);
        /*-----------------------------------------------------------------------------------------------*/

        Student student1= (Student) deSerialization(path);

        System.out.println(student1);



    }

    public static void serialization(String path, Student obj) {

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(obj);


          /* if u are using the try with resources the the no need to use the
                   .close method after use the object .*/
//           objectOutputStream.close();
//           fileOutputStream.close();
            System.out.println("File Serialization Done ....!");

        } catch (FileNotFoundException fnfe) {

            System.out.println("File Serialization Not Done due to Exception  ....!");
            fnfe.printStackTrace();

        } catch (IOException e) {

            System.out.println("File Serialization Not Done due to Exception  ....!");
            throw new RuntimeException(e);
        }
    }

    public static Object deSerialization(String path) {

        try (
                FileInputStream fileInputStream = new FileInputStream(path);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            System.out.println("File Deserialization Not Done due to Exception  ....!");

            return  objectInputStream.readObject();



          /* if u are using the try with resources the the no need to use the
                   .close method after use the object .*/
//           objectOutputStream.close();
//           fileOutputStream.close();

        } catch (IOException | ClassNotFoundException fnfe) {

            System.out.println("File Deserialization Not Done due to Exception  ....!");
            throw new RuntimeException();

        }
    }

}



class Student implements Serializable {

    private static final Long serialVersionUID = 1L;
    private Integer id;
    private String Name;
    private String city;

    public Student(Integer id, String name, String city) {
        this.id = id;
        Name = name;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
