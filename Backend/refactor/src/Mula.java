public class Mula  implements Comparendo, FotoMulta{
    private int limiteInferiorMula = 95;
    private int limiteInferiorIntermedioMula = 96;
    private int limiteSuperiorMula = 110;

    public Mula() {

    }

    @Override
    public int calcularComparendo(int velocidad, String tipoVehiculo) {
        if(tipoVehiculo == "MULA") {
            if(velocidad<=limiteInferiorMula) {
                return 0;
            }else if (velocidad >=limiteInferiorIntermedioMula && velocidad<=limiteSuperiorMula) {
                return 1;
            }
            return 2;
        }

        return -1;
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
        if(tipoVehiculo == "MULA") {
            String cuerpoMensaje = "//enviando correo para el tipo mula.";
            String asunto = "//asunto: comparendo mula";
            return   asunto + cuerpoMensaje;
        } else {
            return "enviando correo con vehiculo desconocido";
        }
    }
}
