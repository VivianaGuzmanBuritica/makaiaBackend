public class Camion implements Comparendo, FotoMulta {
    private int limiteInferiorCamion = 75;
    private int limiteInferiorIntermedioCamion = 76;
    private int limiteSuperiorCamion = 95;

    public Camion() {

    }



    @Override
    public int calcularComparendo(int velocidad, String tipoVehiculo) {
        if(tipoVehiculo == "CAMION") {
            if(velocidad<=limiteInferiorCamion) {
                return 0;
            }else if (velocidad >=limiteInferiorIntermedioCamion && velocidad<=limiteSuperiorCamion) {
                return 1;
            }
            return 2;

            }return -1;
   }

    @Override
    public void construirFotoMulta(int velocidad, String tipoVehiculo) {
        int cpa = calcularComparendo(velocidad, tipoVehiculo);
        String txt = enviarCorreoFotomulta(tipoVehiculo);
        if(cpa == -1){
            System.out.println("no hay calculo para el tipo de vehiculo" + tipoVehiculo + "corre: " + txt);
        }else {
            System.out.println("----el tipo de comparendo es: " + cpa + " ----cuerpo del correo" + txt);
        }


    }

    @Override
    public String enviarCorreoFotomulta(String tipoVehiculo) {
        if(tipoVehiculo == "CAMION") {
        String cuerpoMensaje = "//enviando correo para el tipo camion.";
        String asunto = "//asunto: comparendo camion";
        return   asunto + cuerpoMensaje;
        }
        else{
            return "enviando correo con vehiculo desconocido";
        }
    }
}
