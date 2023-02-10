public class ServicePerson {
    private BasesDeDatos basesDeDatos;

    public ServicePerson(BasesDeDatos basesDeDatos) {
        this.basesDeDatos = basesDeDatos;
    }

    public ServicePerson() {
    }

    public void saveObject(Object object){
        basesDeDatos.save(object);
    }
}
