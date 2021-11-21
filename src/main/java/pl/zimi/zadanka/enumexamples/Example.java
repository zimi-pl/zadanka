package pl.zimi.zadanka.enumexamples;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class Example {
    public enum Seasons {WINTER, SPRING, SUMMER, AUTUMN}

    public enum TicketType implements Commented {
        BUG("HIGH"),
        TASK("MEDIUM") {
            @Override
            public boolean isAssigned() {
                return true;
            }
        },
        SUGGESTION("LOW");
        String priority;

        TicketType(String priority) {
            this.priority = priority;
        }

        public String getPriority() {
            return priority;
        }

        // metoda funkcyjna niekoniecznie używana
        public boolean isAssigned() {
            return false;
        }

        // metoda abstrakcyjna wymaga implementacji w każdej z instancji klasy
        //        public abstract boolean isValid();
        public void Test() {
        }

        @Override
        public void comment() {
            System.out.println("comment= " + this.name());
        }
    }

    public enum Status {
        STOP(0), IGNITION(1), STANDBY(2), RUNNING(3), FAULT(4);
        private int statusValue;

        private Status(int statusValue) {
            this.statusValue = statusValue;
        }

        public int getStatusValue() {
            return statusValue;
        }
//zupełnie zbędne
//        public void setStatusValue(int statusValue) {
//            this.statusValue = statusValue;
//        }
    }

    static void setCat(String input) {
//        if ( input == "drama")
        System.out.println(MovieCategory.valueOf("DRAMA"));
        System.out.println(MovieCategory.DRAMA);
    }


    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        Status machineStatus = Status.FAULT;
        machineStatus.name();
        Seasons currentSeason = Seasons.AUTUMN;

        System.out.println(machineStatus.toString() + " " + machineStatus.ordinal() + " " + machineStatus.name());
        System.out.println(machineStatus.getStatusValue());

        Status virtualMachineStatus = Status.STANDBY;

        //
        TicketType ticket1 = TicketType.TASK;
        System.out.println("-----------------------------------");
        for (TicketType x : TicketType.values()) {
            System.out.println(x.name() + " = " + x.getPriority());
        }
        System.out.println("-----------------------------------");
        for (TicketType x : TicketType.values()) {
            x.comment();
        }
        System.out.println("-----------------------------------");
        TicketType bug = TicketType.BUG;
        TicketType suggestion = TicketType.SUGGESTION;
        TicketType task = TicketType.TASK;
        // porownanie enumow winno być wykonywane za pomocą podwojnego znaku rowności
        System.out.println("are tickets the same? : " + ((bug == suggestion) ? "true" : "false"));

        System.out.println("-----------------------------------");
        // wyspecyfikowany w javie zbiór enumowy do najbardziej wydajnego i optymalnego na wartościach enumowych i implementuje też metody z interfejsu set
        Set<TicketType> ticketSet = EnumSet.of(TicketType.TASK, TicketType.TASK, TicketType.TASK, TicketType.BUG, TicketType.SUGGESTION); // set ignoruje duplikaty
        ticketSet.forEach(System.out::println);

        System.out.println("-----------------------------------");
        EnumMap<TicketType,String> ticketTypeMap = new EnumMap<TicketType, String>(TicketType.class);
        ticketTypeMap.put (TicketType.BUG,"Paweł Cwik");
    }

}
