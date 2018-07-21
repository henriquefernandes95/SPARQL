import org.apache.jena.query.*;


public class QuerySPARQL {
    private String queryS;
    private QueryExecutionFactory factory;
    private org.apache.jena.query.Query query;
    private ResultSet result;
    private QueryExecution queryExecution;
    public QuerySPARQL(){
        queryS = "select * where { ?a ?b ?c. }";
        processQuery();
    }
    public void setQuery(String queryS){
        this.queryS = queryS;
        processQuery();
    }
    private void processQuery(){
        query = new QueryFactory().create(queryS);
        queryExecution = org.apache.jena.query.QueryExecutionFactory.sparqlService("http://dbpedia.org/sparql",queryS);
    }
    public void printResult(){
        result = queryExecution.execSelect();
        ResultSetFormatter.out(System.out, result, query);
        
    }
}
