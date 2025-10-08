public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un día de la semana: ");
        String dia = System.console().readLine();
        System.out.printf("""
                El %s tienes clase de %s
                """, dia.toLowerCase(),
            switch(dia.toLowerCase()){
                case "lunes"->"Sistemas Informáticos";
                case "martes"->"Programación";
                case "miercoles"->"Sistenmas Inforáticos";
                case "miércoles"->"Sistenmas Inforáticos";
                case "jueves"->"IPEI";
                case "viernes"->"Bases de Datos";
                default->"No hay clases este dia";
            }
        );
    }
}
