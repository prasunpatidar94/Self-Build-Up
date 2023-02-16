package design.test;


import java.io.*;

public class ExternalizationSerialLizationAndDeserialization {

    public static void main(String[] args) {

        StudentFromSchool studentFromSchool = new StudentFromSchool(101, "Prasun", "Kasrawad");
        String path = "serializationTest.ser";
        serialization(path, studentFromSchool);
        /*-----------------------------------------------------------------------------------------------*/

        StudentFromSchool studentFromSchool1 = (StudentFromSchool) deSerialization(path);

        System.out.println(studentFromSchool1);


    }

    public static void serialization(String path, StudentFromSchool obj) {

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(path);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ) {
            objectOutputStream.writeObject(obj);
//            objectOutputStream.flush();


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

            return objectInputStream.readObject();
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


class StudentFromSchool implements Externalizable {

    private static final Long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String city;

    public StudentFromSchool() {
        super();
    }

    public StudentFromSchool(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "StudentFromSchool{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeBytes(name);
        out.writeBytes(city);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

        this.id = in.readInt();
        this.name = in.readLine();
        this.city = in.readLine();

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
