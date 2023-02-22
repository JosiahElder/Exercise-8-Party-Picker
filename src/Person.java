class Person
{
    private String firstName, lastName;
    private boolean isInvited;

    public Person(String firstName, String lastName, boolean isInvited)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isInvited = isInvited;
    }

    public boolean isInvited()
    {
        return isInvited;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }
}