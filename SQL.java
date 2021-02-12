public class SQL {
	private String statement;
	
		public SQL()
		{
		
		}
	
		public void setSQLStatement(String state){
		statement = state.toLowerCase();
		}
	
		public String getSQLStatement(){
		return statement;
		}
		
		 // name, city
		public String getProjectedField(){
			String[] arr = statement.split("select");
			String[] arr1 = arr[1].split("from");
			return arr1[0];
		}
		
		// get emp
		public String getTableName(){
			String[] arr = statement.split("from");
			String[] arr1 = arr[1].split(" ");
			return arr1[0];
		}
		
		// age > 20, city = New York
		public String getConditions(){
			String[] arr =  statement.split("where");
			String[] arr1 = arr[1].split("order by");
			return arr1[0];
		}
	
		// words such as and
		public String getLogicalOperator(){
			if(statement.contains("and")) {
				return " and";
			} else if(statement.contains("or")) {
				return " or";
			}
			return " unknown";
		}
	
		// order by name
		public String getOrder(){
			String[] arr = statement.split("order by");
			String[] arr1 = arr[1].split(",");
			return arr1[0];
		}
	
		public String getMainQuery(){
			String[] arr = statement.split("order by");
			String[] arr1 = arr[1].split(" ");
			return arr1[0];
		}
}
