public class EggFigures {

    public static void main(String[] args) {
        egg();
        cup();
        stop();
        hat();
    }
    
        public static void egg() {
           eggTop();
           eggBottom();
           System.out.println();
        }

        public static void eggTop() {
            System.out.println("  ------");
            System.out.println(" /      \\");
            System.out.println("/        \\");
        }

        public static void eggBottom() {
            System.out.println("\\        /");
            System.out.println(" \\      /");
            System.out.println("  ------");
        }

        public static void line() {
            System.out.println("+-------+");
        }

        public static void cup() {

            eggBottom();
            line();
            System.out.println();
        }

        public static void stop() {

          eggTop();
        System.out.println("|  STOP  |");
          eggBottom();
          System.out.println();
        }

        public static void hat() {


        eggTop();
          line();

        }


    }




/* Development strategy:
1)Unstructured
2)Structured
3)Structured without redundancy
*/
