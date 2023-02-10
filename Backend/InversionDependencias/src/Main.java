public class Main {
    public static void main(String[] args) {
        BasesDeDatos mysql = new MySql();
        BasesDeDatos oracle = new Oracle();
        ServicePerson serviceMysql = new ServicePerson(mysql);
        ServicePerson serviceOracle = new ServicePerson(oracle);
        serviceMysql.saveObject(mysql);
        serviceOracle.saveObject(oracle);

    }
}