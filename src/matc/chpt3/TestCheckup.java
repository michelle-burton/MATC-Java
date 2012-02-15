package matc.chpt3;

/**
 * Created by Michelle Burton
 * Date: 2/6/12
 * Time: 12:37 PM
 */
import com.sun.tools.javac.comp.Check;

import javax.swing.JOptionPane;

/*input stream*/
import java.util.Scanner;

public class TestCheckup {
    public static void main(String[] args)
    {
        Checkup myPatient;
        myPatient = getData();
        showValues(myPatient);
    }
    public static Checkup getData()
    {
        Checkup tempPatient = new Checkup();
        double id;
        System.out.print("Enter Blood Pressure Systolic: " + "\n");
        Scanner input = new Scanner(System.in);
        id = input.nextDouble();
        tempPatient.setBloodPressureSystolic(id);

        double id1;
        System.out.print("Enter Blood Pressure Diastolic: " + "\n");
        Scanner input1 = new Scanner(System.in);
        id1 = input1.nextDouble();
        tempPatient.setBloodPressureDiastolic(id1);

        double id2;
        System.out.print("Enter LDL: " + "\n");
        Scanner input2 = new Scanner(System.in);
        id2 = input2.nextDouble();
        tempPatient.setCholesterolLDL(id2);

        double id3;
        System.out.print("Enter HDL: " + "\n");
        Scanner input3 = new Scanner(System.in);
        id3 = input3.nextDouble();
        tempPatient.setCholesterolHDL(id3);
        return tempPatient;

    }

    public static void showValues(Checkup myPatient){
        System.out.println("Blood Pressure:  " + myPatient.getBloodPressureSystolic() + "/" + myPatient.getBloodPressureDiastolic());
        System.out.println("The LDL is:  " + myPatient.getCholesterolLDL());
        System.out.println("The HDL is:  " + myPatient.getCholesterolHDL());

        double cholesterolRatio = Checkup.computeRatio(myPatient.getCholesterolLDL(),myPatient.getCholesterolHDL());
        System.out.println("LDL divided by HDL Ratio  " + cholesterolRatio);
        myPatient.explainRatio(cholesterolRatio);
    }

   //    prompt for values for each, call checkup(value) to calculate

}
