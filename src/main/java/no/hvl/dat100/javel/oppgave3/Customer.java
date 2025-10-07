package no.hvl.dat100.javel.oppgave3;

public class Customer {

    // TODO - object variables (attributes)
    private String name;
    private String email;
    private int customer_id;
    private PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {

        // TODO
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement;
    }

    // TODO - getter/setter methods for all objectvariables

    //region GettersAndSetters
    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getCustomer_id(){
        return customer_id;
    }

    public PowerAgreementType getAgreement(){
        return agreement;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setEmail(String newEmail){
        email = newEmail;
    }

    public void setCustomer_id(int newCustomer_id){
        customer_id = newCustomer_id;
    }

    public void setAgreement(PowerAgreementType newAgreement){
        agreement = newAgreement;
    }
    //endregion

    // TODO - toString method

    public String toString(){
        return "Customer number " + customer_id + "\n" + "Name " + name + "\n" + "Email " + email + "\n" + "Agreement " + agreement;
    }

}
