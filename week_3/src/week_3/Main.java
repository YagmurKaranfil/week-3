package week_3;

public class Main {

	public static void main(String[] args) {
		
	//CreditManager creditManager = new CreditManager();
	//creditManager.Calculate();
	//creditManager.Calculate();
	//creditManager.Save();
	
	//Customer customer = new Customer(); //örneðini oluþturma,instance oluþturmak, instance creation
	//customer.id = 1;
	//customer.city="Ankara";
	
	
	
	//CustomerManager customerManager = new CustomerManager(customer);
	//customerManager.Save();
	//customerManager.Delete();
	
	//Company company = new Company();
	//company.taxNumber="100000";
	//company.companyName="Arçelik";
	//company.id = 100;
	
	//CustomerManager customerManager2 = new CustomerManager(new Personal());
	
	//Personal personal= new Personal();
	//personal.firstName="";
	//personal.nationalIdentity="";
	
	//Customer c1=new Customer();
	//Customer c2=new Personal();
	//Customer c3=new Company();
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();
	}

}
