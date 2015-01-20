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

    @DatabaseField(id = true, columnName = "EmployeeID")
    int employeeId;

    @DatabaseField(columnName = "LastName")
    String lastName;

    @DatabaseField(columnName = "FirstName")
    String firstName;

    @DatabaseField(columnName = "Title")
    String title;

    @DatabaseField(columnName = "TitleOfCourtesy")
    String titleOfCourtesy;

    @DatabaseField(columnName = "BirthDate", dataType = DataType.DATE_STRING, format = "yyyy-MM-dd")
    Date birthDate;

    @DatabaseField(columnName = "HireDate", dataType = DataType.DATE_STRING, format = "yyyy-MM-dd")
    Date hireDate;

    @DatabaseField(columnName = "Address")
    String address;

    @DatabaseField(columnName = "City")
    String city;

    @DatabaseField(columnName = "Region")
    String region;

    @DatabaseField(columnName = "PostalCode")
    String postalCode;

    @DatabaseField(columnName = "Country")
    String country;

    @DatabaseField(columnName = "HomePhone")
    String homePhone;

    @DatabaseField(columnName = "Extension")
    String extension;

    @DatabaseField(columnName = "Photo", dataType = DataType.BYTE_ARRAY)
    byte[] photo;

    @DatabaseField(columnName = "Notes")
    String notes;

    // Set this up as a reference, we're ignoring for now
//    @DatabaseField
//    int ReportsTo;

    @DatabaseField(columnName = "PhotoPath")
    String photoPath;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeID) {
        employeeID = employeeID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        this.titleOfCourtesy = titleOfCourtesy;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }


    //FOREIGN KEY ([EmployeeID]) REFERENCES [Employees] ([EmployeeID])


    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeID=" + employeeId +
                ", lastName='" + lastName + '\'' +
                ", FirstName='" + firstName + '\'' +
                ", Title='" + title + '\'' +
                ", TitleOfCourtesy='" + titleOfCourtesy + '\'' +
                ", BirthDate=" + birthDate +
                ", HireDate=" + hireDate +
                ", Address='" + address + '\'' +
                ", City='" + city + '\'' +
                ", Region='" + region + '\'' +
                ", PostalCode='" + postalCode + '\'' +
                ", Country='" + country + '\'' +
                ", HomePhone='" + homePhone + '\'' +
                ", Extension='" + extension + '\'' +
                ", Photo='" + photo + '\'' +
                ", Notes='" + notes + '\'' +
                ", PhotoPath='" + photoPath + '\'' +
                '}';
    }
}
