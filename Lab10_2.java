
public class Lab10_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputeTotalSales[ ] goods=new ComputeTotalSales[18];
	      for(int i=0;i<goods.length;i++)
	       {
	           if(i%3==0)
	             goods[i]=new Television( );
	           else if(i%3==1)
	             goods[i]=new Computer( );
	           else if(i%3==2)
	             goods[i]=new Mobile( );
	       } 
	     Shop  shop=new Shop(goods);
	     int sales = 36000;
	     if(sales != shop.giveTotalSales())
	    	 System.out.println("Lab10_2 failed!");
	     else
	    	 System.out.println("Lab10_2 accepted!");

	}

}
