package Settings;

public class UserSettings {

    /*
    All variables public
    Strings are   username
                  password
                  Address1
                  City
                  ZipCode
                  ItemName
                  customText
                  color

    boolean       wanaCustomText
    double        myPrice

     */


    /*
   Bütün variables lar  public
   Stringler   username
                 password
                 Address1
                 City
                 ZipCode
                 ItemName
                 customText
                 color

   boolean       wanaCustomText
   double        myPrice

    */

    public String username;
    public String password;
    public String Address1;
    public String City;
    public String ZipCode;
    public String ItemName;
    public String customText;
    public String color;

    public boolean wanaCustomText;
    public double myPrice;





    /*

     Create a toString method
         return all the variables like

                "\nusername : " + username +
                "\npassword :" + password +
                "\nAddress1 " + Address1+
                 ........

     */


    /*

         toString methodunu oluşturun
         Bütün variables ları aşağıdaki gibi return et

                "\nusername : " + username +
                "\npassword :" + password +
                "\nAddress1 " + Address1+
                 ........
        // todo toString
     */

    @Override
    public String toString() {
        return "UserSettings{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", Address1='" + Address1 + '\'' +
                ", City='" + City + '\'' +
                ", ZipCode='" + ZipCode + '\'' +
                ", ItemName='" + ItemName + '\'' +
                ", customText='" + customText + '\'' +
                ", color='" + color + '\'' +
                ", wanaCustomText=" + wanaCustomText +
                ", myPrice=" + myPrice +
                '}';
    }
}
