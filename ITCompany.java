/**
 * ITCompany
 */
class ITCompany 
{
    void display()
    {
        System.out.println("This is ITCompany class");
    }
    public static void main(String[] args) 
    {
        ITCompany it = new ITCompany();
        it.display();

        Development dmt = new Development();
        dmt.display();
        
        Design des = new Design();
        des.display();

        Testing tes = new Testing();
        tes.display();

        Sales sal = new Sales();
        sal.display();

        Account ac = new Account();
        ac.display();       

    }
}
class Development extends ITCompany
{
    void display()
    {
        System.out.println("This is Development class");
    }
}
class Design extends ITCompany
{
    void display()
    {
        System.out.println("This is Design class");
    }
}
class Testing extends ITCompany
{
    void display()
    {
        System.out.println("This is Testing class");
    }
}
class Sales extends ITCompany
{
    void display()
    {
        System.out.println("This is Sales class");
    }
}
class Account extends ITCompany
{
    void display()
    {
        System.out.println("This is Account class");
    }
}