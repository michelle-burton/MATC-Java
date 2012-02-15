package matc.chpt3;

import javax.swing.event.ListDataListener;

/**
 * Created by Michelle Burton
 * Date: 2/6/12
 * Time: 12:36 PM
 */
public class Checkup {

     // Checkup fields
    private int patientNumber;
    private double bloodPressureSystolic;
    private double bloodPressureDiastolic;
    private double cholesterolLDL;
    private double cholesterolHDL;


    // Get and Set
    public int getPatientNumber()
    {
        return patientNumber;
    }
    public void setPatientNumber(int patientNum)
    {
        patientNumber = patientNum;
    }
    public double getBloodPressureSystolic()
    {
        return bloodPressureSystolic;
    }
    public void setBloodPressureSystolic(double systolic)
    {
        bloodPressureSystolic = systolic;
    }
    public double getBloodPressureDiastolic()
    {
        return  bloodPressureDiastolic;
    }
    public void setBloodPressureDiastolic(double diastolic)
    {
        bloodPressureDiastolic = diastolic;
    }
    public double getCholesterolHDL()
    {
        return cholesterolHDL;
    }
    public void setCholesterolHDL(double hdl)
    {
        cholesterolHDL = hdl;
    }
    public double getCholesterolLDL()
    {
        return  cholesterolLDL;
    }
    public void setCholesterolLDL(double ldl)
    {
        cholesterolLDL = ldl;
    }


    public static double computeRatio(double ldl, double hdl)
    {
        double cholesterolRatio;
        cholesterolRatio = ldl/hdl;
        return cholesterolRatio;
    }
    public void explainRatio(double cholesterolRatio)
    {
        if (cholesterolRatio < 3.5) {
             System.out.println("HDL is know as Good Cholesterol, and your ratio is below 3.5 which is optimum  ");
        }
        else{
              System.out.println("Your ratio is below 3.5, which needs improvement. ");
        }
    }
}




