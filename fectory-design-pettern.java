


//not expose the obaject creation implimention to end user



//Main Class 

package design.fectory;

public class FectoryMain {

    public static void main(String[] args) {

        FectoryOfCloud fectoryOfCloud = new FectoryOfCloud();
        Cloud cloudAzure = fectoryOfCloud.getCloudProvider("Azure");
        Cloud cloudGCP = fectoryOfCloud.getCloudProvider("GCP");
        Cloud cloudAWS = fectoryOfCloud.getCloudProvider("AWS");

        cloudAzure.printNameOfCloud();
        cloudGCP.printNameOfCloud();
        cloudAWS.printNameOfCloud();

    }
}

//Fectory Class 


package design.fectory;

public class FectoryOfCloud {

    public Cloud getCloudProvider(String providerName){

        if(providerName.equalsIgnoreCase("AWS")){
            return new AWS();
        }else if(providerName.equalsIgnoreCase("GCP")){
            return new GCP();
        } else if (providerName.equalsIgnoreCase("Azure")) {
            return new Azure();
        }
        return null;
    }

}

//Top Interface 
package design.fectory;

public interface Cloud {
    public void printNameOfCloud();
}


//child or implimention classs

//1
package design.fectory;

public class AWS implements Cloud{

    @Override
    public void printNameOfCloud() {
        System.out.println("This is ths AWS Cloud...!!!");
    }
}


//2

package design.fectory;

public class Azure implements Cloud{
    @Override
    public void printNameOfCloud() {
        System.out.println("This is ths Azure Cloud...!!!");
    }
}


//3


package design.fectory;

public class GCP implements Cloud {

    @Override
    public void printNameOfCloud() {
        System.out.println("This is ths GCP Cloud...!!!");
    }
}







