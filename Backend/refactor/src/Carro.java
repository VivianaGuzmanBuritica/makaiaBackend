public class Carro implements Comparendo, FotoMulta{
    private int limiteInferiorCarro = 65;
    private int limiteInferiorIntermedioCarro = 66;
    private int limiteSuperiorCarro = 85;

    public Carro() {
       }

    @Override
    public int calcularComparendo(int velocidad, String tipoVehiculo){
        if(tipoVehiculo == "CARRO"){
            if(velocidad<=limiteInferiorCarro){
                return 0;
            }else if (velocidad >=limiteInferiorIntermedioCarro && velocidad<=limiteSuperiorCarro) {
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
        if(tipoVehiculo == "CARRO") {
            String cuerpoMensaje = "//enviando correo para el tipo carro.";
            String asunto = "//asunto: comparendo carro";
            return   asunto + cuerpoMensaje;
        }else{
            return "enviando correo con vehiculo desconocido";
        }
    }
}
