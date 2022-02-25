
package Controlador;

/**
 *
 * @author brianandreirosasmendoza
 */
import Modelo.MDB;
import Vista.FrmCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorCliente implements ActionListener{
  private FrmCliente _view; //el formulario 
  private MDB _model;//el manejador de bases de datos

    
    public ControladorCliente(FrmCliente view, MDB model){
       this._model=model;
       this._view=view;
        this._view.cmdConfirmar.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
}
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.cmdConfirmar){ //Si el botón presionado fue el de alta
         // System.out.print("paso");
        leyenda=_model.registrarAlta("tbusuarios"," null, ' " +_view.txtNombre.getText()+" ',' " +_view.txtApellidoP.getText() +" ', "+_view.txtApellidoM.getText() +" ', "+_view.txtEdad.getText() +" ', "+_view.txtDireccion.getText() +" ', "+_view.txtCivil.getText() +" ', "+_view.txtCelular.getText() +" ', "+_view.txtTelefono.getText() +" ', "+_view.txtMail.getText());
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
       System.out.print (leyenda);
       JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
}
}
public void iniciar(){
_view.setTitle("MVC_Visual");
}
public void limpiar(){
_view.txtNombre.setText(null);
_view.txtApellidoP.setText(null);
_view.txtApellidoM.setText(null);
_view.txtEdad.setText(null);
_view.txtDireccion.setText(null);
_view.txtCivil.setText(null);
_view.txtCelular.setText(null);
_view.txtTelefono.setText(null);
_view.txtMail.setText(null);//Holis, los quiero mucho
}
}
