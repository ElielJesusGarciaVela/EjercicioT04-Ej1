public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un día de la semana: ");
        String dia = System.console().readLine();

        switch (dia.toLowerCase()){
            case  "lunes":
                System.out.print("La primera asignatura de este dia es Sistemas Informáticos.");
                break;
            case "martes":
                System.out.print("La primera asignatura de este dia es Programación.");
                break;
            case "miercoles":
                System.out.print("La primera asignatura de este dia es Sistenmas Inforáticos.");
                break;
            case "miércoles":
                System.out.print("La primera asignatura de este dia es Sistenmas Inforáticos.");
                break;
            case "jueves":
                System.out.print("La primera asignatura de este dia es IPEI.");
                break;
            case "viernes":
                System.out.print("La primera asignatura de este dia es Bases de Datos.");
                break;
            default:
                System.out.print("No has insertado un dia de la semana valido.");
        }
    }
}
