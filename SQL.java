public class SQL {
	private String statement;
	
		public SQL()
		{
		
		}
	
		public void setSQLStatement(String state){
		statement = state;
		}
	
		public String getSQLStatement(){
		return statement;
		}
		
		 // name, city
		public String getProjectedField(){
			int word = "select".length();
			int start = statement.indexOf("Select");
			int end = statement.indexOf("from");
			return statement.substring(start+word,end);
		}
		
		// get emp
		public String getTableName(){
			int word = "from".length();
			int start = statement.indexOf("from");
			int end = statement.indexOf("where");
			return statement.substring(start+word,end);
		}
		
		// age > 20, city = New York
		public String getConditions(){
			int word = "where".length();
			int start = statement.indexOf("where");
			int end = statement.indexOf("order");
			return statement.substring(start+word,end);
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
			int start = statement.indexOf("order");
			int end = statement.length();
			return statement.substring(start+8,end);
		}
	
		public String getMainQuery(){
			int start = statement.indexOf("order");
			int end = statement.indexOf(getConditions())-5;
			return statement.substring(0,end);
		}
}
