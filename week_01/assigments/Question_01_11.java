package week_01.assigments;

public class Question_01_11 {
    public static void main(String[] args) {
        System.out.println("Population projection");
        System.out.println("Current population: 312,032,486 ");
        System.out.println("One birth every 7 seconds");
        System.out.println("One death every 13 seconds");
        System.out.println("One new immigrant every 45 seconds ");
        System.out.println("Current population +(births per year)");
        System.out.println("                   -(deaths per year)");
        System.out.println("                   +(new immigrants per year");

        System.out.println("Year 1 projection:");
        System.out.println(312032486+(365.0*24*60*60/7)-(365.0*24*60*60/13)+(365.0*24*60*60/45));

        System.out.println("Year 2 projection:");
        System.out.println(312032486+2*((365.0*24*60*60/7)-(365.0*24*60*60/13)+(365.0*24*60*60/45)));

        System.out.println("Year 3 projection:");
        System.out.println(312032486+3*((365.0*24*60*60/7)-(365.0*24*60*60/13)+(365.0*24*60*60/45)));

        System.out.println("Year 4 projection:");
        System.out.println(312032486+4*((365.0*24*60*60/7)-(365.0*24*60*60/13)+(365.0*24*60*60/45)));

        System.out.println("Year 5 projection:");
        System.out.println(312032486+5*((365.0*24*60*60/7)-(365.0*24*60*60/13)+(365.0*24*60*60/45)));

    }
}
