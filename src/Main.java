import org.aksw.jena_sparql_api.core.QueryExecutionFactory;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.*;

import javax.management.Query;

public class Main {


    public static void main(String[] args) {
//        QueryExecutionFactory factory;
//        String queryS = "select * where { ?a ?b ?c. }";
//        org.apache.jena.query.Query query = new QueryFactory().create(queryS);
//        QueryExecution queryExecution = org.apache.jena.query.QueryExecutionFactory.sparqlService("http://dbpedia.org/sparql",queryS);
//        ResultSet result = queryExecution.execSelect();
//        ResultSetFormatter.out(System.out, result, query);
        QuerySPARQL querySPARQL = new QuerySPARQL();
        querySPARQL.printResult();

    }
}
