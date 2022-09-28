package trabajo.extra.pkg2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
//========EJERCICIO 1 (Salario)=============================================         
        float HorasLaboradas;
        float PrecioHora;
        byte AñosAntiguedad;
        double SalarioBruto;
        double SalarioNeto;
        double Deducciones;
        double Bono;

        AñosAntiguedad = Byte.parseByte(JOptionPane.showInputDialog(
                "Ingrese la cantidad de años de antiguedad en la empresa: "));

        HorasLaboradas = Float.parseFloat(JOptionPane.showInputDialog(
                "Ingrese la cantidad de horas laboradas a la semana: "));

        PrecioHora = Float.parseFloat(JOptionPane.showInputDialog(
                "Ingrese el valor de su hora en dólares: "));

        SalarioBruto = ( HorasLaboradas * PrecioHora ) * 4;
        
        if ( AñosAntiguedad > 10 ) {

            Bono = SalarioBruto * 0.20;

            SalarioBruto = Bono + SalarioBruto;

            if ( SalarioBruto > 1000 && SalarioBruto < 2000 ) {

                Deducciones = SalarioBruto * 0.10;

                SalarioNeto = SalarioBruto - Deducciones;

                JOptionPane.showMessageDialog(null,
                        "Su salario neto es de: " + SalarioNeto);

            } else if ( SalarioBruto > 2000 ) {

                Deducciones = SalarioBruto * 0.15;

                SalarioNeto = SalarioBruto - Deducciones;

                JOptionPane.showMessageDialog(null,
                        "Su salario neto es de: " + SalarioNeto);
            }
        } else {

            JOptionPane.showMessageDialog(null,
                    "Su Salario es de: " + SalarioBruto);
        }
//=====================EJERCICIO 2(Farmacia)=================================
        
        
        
        
        
//====================EJERCICIO 3(Temperatura)===============================
        
        
 
        
//====================EJERCICIO 4(Casino)====================================     
    }
    
}
