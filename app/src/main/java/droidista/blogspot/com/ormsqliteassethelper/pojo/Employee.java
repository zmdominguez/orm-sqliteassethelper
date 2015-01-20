package droidista.blogspot.com.ormsqliteassethelper.pojo;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by zarah.dominguez on 20/01/15.
 */
@DatabaseTable(tableName = "Employees")
public class Employee {

    @DatabaseField(id = true)
    int EmployeeID;

    @DatabaseField
    String LastName;

    @DatabaseField
    String FirstName;

    @DatabaseField
    String Title;

    @DatabaseField
    String TitleOfCourtesy;

    @DatabaseField(dataType = DataType.DATE_STRING, format = "yyyy-MM-dd")
    Date BirthDate;

    @DatabaseField(dataType = DataType.DATE_STRING, format = "yyyy-MM-dd")
    Date HireDate;

    @DatabaseField
    String Address;

    @DatabaseField
    String City;

    @DatabaseField
    String Region;

    @DatabaseField
    String PostalCode;

    @DatabaseField
    String Country;

    @DatabaseField
    String HomePhone;

    @DatabaseField
    String Extension;

    @DatabaseField(dataType = DataType.BYTE_ARRAY)
    byte[] Photo;

    @DatabaseField
    String Notes;

//    @DatabaseField
//    int ReportsTo;

    @DatabaseField
    String PhotoPath;

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitleOfCourtesy() {
        return TitleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        TitleOfCourtesy = titleOfCourtesy;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date birthDate) {
        BirthDate = birthDate;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public void setHireDate(Date hireDate) {
        HireDate = hireDate;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone(String homePhone) {
        HomePhone = homePhone;
    }

    public String getExtension() {
        return Extension;
    }

    public void setExtension(String extension) {
        Extension = extension;
    }

    public byte[] getPhoto() {
        return Photo;
    }

    public void setPhoto(byte[] photo) {
        Photo = photo;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public String getPhotoPath() {
        return PhotoPath;
    }

    public void setPhotoPath(String photoPath) {
        PhotoPath = photoPath;
    }


    //FOREIGN KEY ([EmployeeID]) REFERENCES [Employees] ([EmployeeID])


    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID=" + EmployeeID +
                ", LastName='" + LastName + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", Title='" + Title + '\'' +
                ", TitleOfCourtesy='" + TitleOfCourtesy + '\'' +
                ", BirthDate=" + BirthDate +
                ", HireDate=" + HireDate +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", Region='" + Region + '\'' +
                ", PostalCode='" + PostalCode + '\'' +
                ", Country='" + Country + '\'' +
                ", HomePhone='" + HomePhone + '\'' +
                ", Extension='" + Extension + '\'' +
                ", Photo='" + Photo + '\'' +
                ", Notes='" + Notes + '\'' +
                ", PhotoPath='" + PhotoPath + '\'' +
                '}';
    }
}
