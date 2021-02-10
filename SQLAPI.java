
public class SQLAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SQL SQLObject = new SQL();
		SQLObject.setSQLStatement("Select name, city from Emp where age > 20 and city = 'New York' order By name" );
		
		  System.out.println("1- Extract all words");
	      String[] arr = SQLObject.getSQLStatement().split(" ");    

	      for ( String ss : arr) {
	          System.out.println(ss);
	      }    
	      System.out.println("2-  Protected Field:" + SQLObject.getProjectedField());
	      System.out.println("3-  Table name:"+ SQLObject.getTableName());
	      System.out.println("4-  Conditions:"+ SQLObject.getConditions());
	      System.out.println("5-  Logic Operator:"+ SQLObject.getLogicalOperator());
	      System.out.println("6-  Order by: "+ SQLObject.getOrder());
	      System.out.println("7-  Main Query:"+ SQLObject.getMainQuery());
		}
}

