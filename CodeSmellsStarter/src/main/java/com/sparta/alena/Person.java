package com.sparta.alena;

public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
        this.age = age;
    }
    public Person() { }

    public Person(String fName, String lName)
    {
        this.firstName = fName;
        this.lastName = lName;
    }
    public Person(String fName, String lName, Address address)
    {
        this(fName, lName);
        this.address = address;
    }


    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public String move()
    {
        return "Walking along";
  //      System.out.println("Can't get here");
    }

    public String move(int times)
    {
        return "Walking along " + times + " times";
    }

    @Override
    public  String toString()
{
    String addressString = getAddressString();
    return super.toString() + " Name: " + getFullName() + " Age: " + age + ". " + addressString;
}

    String getAddressString() {
        return "Address: " + getAddressString();
    }

    //public int stupidMethod()
    //{
    //    return 3;
    //}
}