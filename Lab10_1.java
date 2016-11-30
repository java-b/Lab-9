

public class Lab10_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[ ] employee=new Employee[18];
	      for(int i=0;i<18;i++)
	       {
	           if(i%3==0)
	             employee[i]=new WeekWorker( );
	           else if(i%3==1)
	             employee[i]=new MonthWorker( );
	           else if(i%3==2)
	             employee[i]=new YearWorker( );
	           
	       } 
	     Company company=new Company(employee);
	     double salaries = 2424.0;
	     
	     if(salaries != company.salariesPay())
	    	 System.out.println("Lab10_1 failed!");
	     else
	    	 System.out.println("Lab10_1 accepted!");

	}

}
