package seabstianougterolsen;



public class Test {

    public static void main(String[] args) {

       //Connection con = DB_Connector.connect();
       DB_Statements stmts = new DB_Statements();
       //stmts.createNewDB();
        stmts.useDB("ThisDatabase");
        //stmts.createTable("MyTable");
        //stmts.insertData("MyTable");
        stmts.selectFromTable("myTable");

    }
}
